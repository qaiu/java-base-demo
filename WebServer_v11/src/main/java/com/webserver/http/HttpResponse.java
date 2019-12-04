package com.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ��Ӧ����
 * �����ÿһ��ʵ����ʾ����˸��ͻ��˷��͵�
 * ��Ӧ����
 * һ����Ӧ�����������
 * 
 * ״̬��
 * ��Ӧͷ
 * ��Ӧ����
 * @author QAIU
 *
 */
public class HttpResponse {
	//��������ص���Ϣ
//	private Socket socket;
	private OutputStream out;
	
	//��Ӧ���������Ϣ
	/**
	 * ��Ӧ���ĵ�ʵ���ļ�,���ļ�ͨ�����û������ʵ����Դ�ļ�(ҳ��ͼƬ������)
	 * ����Ὣ�ļ�������Ϊ��Ӧ���ķ��͸��ͻ���
	 */
	private File entity;

	// ״̬�������Ϣ
	// ״̬����,Ĭ��ֵ200,��Ϊ�������Ӧ���ǳɹ���
	private int statusCode = 200;
	private String statusReason = "OK";


	//��Ӧͷ�����Ϣ
	//�������Ҫ���͵���Ӧͷ,Key����Ӧͷ������,Value����Ӧͷ��Ӧ��ֵ
	private Map<String, String> headers = new HashMap<>();
	


	//��Ӧ���������Ϣ

	public HttpResponse(Socket socket) {
		try {
//			this.socket = socket;
			this.out = socket.getOutputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ����ǰ��Ӧ����������Ա�׼HTTP��ʽ
	 * ���͸��ͻ���
	 */
	public void flush() {
		try {
			/*
			 * ����Iһ����Ӧ�ֳ�����
			 * 1:����״̬��
			 * 2:������Ӧͷ
			 * 3:������Ӧ����
			 */
			System.out.println("HttpResponse:��ʼ������Ӧ...");
			sendStatusLine();
			sendHandler();
			sendContent();
			System.out.println("HttpResponse:������Ӧ���!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ����״̬��
	 */
	private void sendStatusLine() {
		System.out.println("HttpResponse:��ʼ����״̬��...");
		try {
			String line = "HTTP/1.1"+" "+statusCode+" "+statusReason;
			printLine(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:������Ӧ���!");
	}

	/**
	 * ������Ӧͷ
	 */
	private void sendHandler() {
		System.out.println("HttpResponse:��ʼ������Ӧͷ...");
		try {
			/*
			 * ��Ӧͷ�г���������Ӧͷ
			 * Content-Type���ڸ�������������е�������ʲô(����
			 * ͼƬ,ҳ��),�������Ӧͷ��ʲôҲ��ָ��,��������������ж�
			 * ��ô����������֮ǰ����ĵ�ַ���ж�
			 * 
			 * Content-Length,�������������ʵ�ʳ���,��λ�ֽ�,
			 * �������ȡʵ�ʳ��Ⱥ�ʵ�ʶ�ȡ���ֽ�����������������
			 * 
			 */
			Set<Entry<String,String>> set =headers.entrySet();
			for (Entry<String, String> e : set) {
				String name  = e.getKey();
				String value = e.getValue();
				String line = name+": "+value;
				System.out.println(line);
				printLine(line);
			}
			
			//��������CRLF��ʾ��Ӧͷ�������
			printLine("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:������Ӧͷ���!");
	}

	/**
	 * ������Ӧ����
	 */
	private void sendContent() {
		System.out.println("HttpResponse:��ʼ������Ϣ����...");
		try(FileInputStream fis = new FileInputStream(entity);) {
			int len = -1;
			byte[] data = new byte[1024*10];
			while ((len = fis.read(data)) != -1) {
				out.write(data,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpResponse:������Ϣ�������!");
	}
	/**
	 * ���������ַ������͸��ͻ��˷��ͺ���CR,LF����
	 * @param line
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	private void printLine(String line) throws UnsupportedEncodingException, IOException {
		out.write(line.getBytes("ISO8859-1"));
		out.write(HttpContext.CR);
		out.write(HttpContext.LF);
	}
	
	
	/**
	 * ��ȡ��Ӧ����
	 * @return entity
	 */
	public File getEntity() {
		return entity;
	}
	/**
	 * ���������ļ�,
	 * ���õ�ͬʱ������ļ������Զ�����������Ӧ����Ӧͷ
	 * Content-Type
	 * Content-Length
	 * @param entity
	 */
	public void setEntity(File entity) {
		this.entity = entity;

		//�Ȼ�ȡ��Դ�ļ���
		//logo.png
		//��ȡ��׺��png 
		String fileName = entity.getName();
		String ext = fileName.substring(
				fileName.lastIndexOf(".")+1);
		String type = HttpContext.getContentType(ext);
		//������Ӧͷ
		putHeader("Content-Type", type);
		putHeader("Content-Length", String.valueOf(entity.length()));
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	/**
	 * ���Ҫ���͵���Ӧͷ
	 * @param name ��Ӧͷ������
	 * @param value ��Ӧͷ��Ӧ��ֵ
	 */
	public void putHeader(String name, String value) {
		headers.put(name, value);
	}

}
