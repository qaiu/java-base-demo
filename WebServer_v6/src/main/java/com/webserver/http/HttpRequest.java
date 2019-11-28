package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Map;

import java.util.HashMap;
/**
 * �������
 * ������ÿһ��ʵ�����ڱ�ʾ�ͻ��˷��͹�����һ����������
 * ÿ�����������������:
 * 1:������
 * 2:��Ϣͷ
 * 3:��Ϣ����
 * 
 * ����ɲ����ĵ�(http.txt)
 * @author QAIU
 *
 */
public class HttpRequest {

	//��������ص�����
	private Socket socket;
	private InputStream in;
	
	//�����������Ϣ
	private Map<String, String> headers = new HashMap<>();
	//����ʽ
	private String method;
	//������Դ·��(url���󲿷�)
	private String uri;
	/**
	 * �ṩ��ȡ������ص�һϵ��GET����
	 * ���ﲻ�ṩSET����,��Ϊ�������
	 * ��ʾ�������ǿͻ��˷��͹���������
	 * ����Ҫ�޸�
	 * @return
	 */
	public String getUri() {
		return uri;
	}
	
	public String getMethod() {
		return method;
	}

	public String getProtocol() {
		return protocol;
	}
	
	public String getHeader(String name) {
		return headers.get(name);
	}

	//Э��汾
	private String protocol;
	//��Ϣͷ�����Ϣ

	//��Ϣ���������Ϣ
	/**
	 * HttpRequest�� ���췽��,ʵ�����Ĺ��̾���
	 * ��ȡ�ͻ��˷��͹������󲢽����Ĺ���
	 * ʵ������Ķ��󼴱�ʾ�˴η��͹�������������
	 */
	public HttpRequest(Socket socket) {
		try {
			//ͨ��Socket��ȡ������,�Ա�����
			//�������������ͻ�������ʱʹ��
			in= socket.getInputStream();
			/*
			 * ��������,����Socket������������
			 */
			this.socket = socket;

			/*
			 * ��������ֳ�����
			 * 1:����������
			 * 2:������Ϣͷ
			 * 3:������Ϣ����
			 */
			parseRequestLine();
			parseHeaders();
			parseContent();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ����������
	 */
	private void parseRequestLine() {
		System.out.println("HttpRequest:��ʼ����������...");
		try {
			String line = readline();
			System.out.println("����������:"+line);
			String[] strings = line.split(" ");
			method = strings[0];
			uri = strings[1];
			protocol = strings[2];
			System.out.println("method:"+method);
			System.out.println("uri:"+uri);
			System.out.println("protocol:"+protocol);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:�������������!");

	}

	/**
	 * ������Ϣͷ
	 */
	private void parseHeaders() {
		System.out.println("HttpRequest:��ʼ������Ϣͷ...");
		try {
			while (true) {
				String line = readline();
				if ("".equals(line)) {
					break;
				}
				System.out.println(line);
				/*
				 * ��ÿ����Ϣͷ����ð�ſո���Ϊ����
				 * ��һ����ΪKey,�ڶ�����Ϊvalue����
				 * ��Handler������������Ϣͷ����
				 */
				String[] data = line.split(": ");
				headers.put(data[0], data[1]);
			}
			System.out.println(headers);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:������Ϣͷ���!");
	}

	/**
	 * ������Ϣ����
	 */
	private void parseContent() {
		System.out.println("HttpRequest:��ʼ������Ϣ����...");

		System.out.println("HttpRequest:������Ϣ�������!");
	}

	/**
	 * ͨ��in��ȡ�ͻ��˷��͹�����һ���ַ���
	 * ��(CRLF��β),���ǲ�����CRLF
	 * �˷����ڽ��������к���Ϣͷʱʹ��
	 * @return
	 * @throws IOException 
	 */
	private String readline() throws IOException {
		//���ȶ�ȡ�ͻ��˷��͹����ĵ�һ���ַ���
		//��Ϊһ������ĵ�һ�о�������������
		int d = -1;
		char c1='a',c2='a';
		StringBuilder str = new StringBuilder();
		while ((d = in.read()) != -1) {
			c2 = (char)d;
			if (c1 == 13&&c2 == 10) {
				break;
			}
			c1 = c2;
			str.append(c1);
		}
		return  str.toString().trim();
	}
}
