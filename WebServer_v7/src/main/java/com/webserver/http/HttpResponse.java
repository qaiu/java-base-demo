package com.webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

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
	private Socket socket;
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



	//��Ӧ���������Ϣ

	public HttpResponse(Socket socket) {
		try {
			this.socket = socket;
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
			out.write(line.getBytes("ISO8859-1"));
			out.write(13);
			out.write(10);
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
			String line = "Content-Type: text/html";
			out.write(line.getBytes("ISO8859-1"));
//			out.write(line.getBytes());

			out.write(13);
			out.write(10);
			
			line = "Content-Length:��"+entity.length();
			out.write(line.getBytes("ISO8859-1"));
//			out.write(line.getBytes(""));

			out.write(13);
			out.write(10);
			
			//��������CRLF��ʾ��Ӧͷ�������
			out.write(13);
			out.write(10);
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

	public File getEntity() {
		return entity;
	}

	public void setEntity(File entity) {
		this.entity = entity;
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
	
	

}
