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
//	private Socket socket;
	private InputStream in;
	
	//�����������Ϣ
	private Map<String, String> headers = new HashMap<>();
	//����ʽ
	private String method;
	//������Դ·��(url���󲿷�)
	private String uri;

	//Э��汾
	private String protocol;
	//��Ϣͷ�����Ϣ
	
	private String requestURI;
	private String queryString;
	
	private Map<String, String> parameters = new HashMap<>();
	
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


	//��Ϣ���������Ϣ
	/**
	 * HttpRequest�� ���췽��,ʵ�����Ĺ��̾���
	 * ��ȡ�ͻ��˷��͹������󲢽����Ĺ���
	 * ʵ������Ķ��󼴱�ʾ�˴η��͹�������������
	 * @throws EmptyRequestException 
	 */
	public HttpRequest(Socket socket) throws EmptyRequestException {
		try {
			//ͨ��Socket��ȡ������,�Ա�����
			//�������������ͻ�������ʱʹ��
			in= socket.getInputStream();
			/*
			 * ��������,����Socket������������
			 */
//			this.socket = socket;

			/*
			 * ��������ֳ�����
			 * 1:����������
			 * 2:������Ϣͷ
			 * 3:������Ϣ����
			 */
			parseRequestLine();
			parseHeaders();
			parseContent();
		} catch (EmptyRequestException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * ����������
	 * @throws EmptyRequestException 
	 */
	private void parseRequestLine() throws EmptyRequestException {
		System.out.println("HttpRequest:��ʼ����������...");
		try {
			String line = readline();
			//�Ƿ������
			if ("".equals(line)) {
				throw new EmptyRequestException();
			}
			System.out.println("����������:"+line);
			String[] strings = line.split(" ");
			method = strings[0];
			uri = strings[1];
			protocol = strings[2];
			System.out.println("method:"+method);
			System.out.println("uri:"+uri);
			System.out.println("protocol:"+protocol);
			//��һ������URI
			parseURI();
		} catch (EmptyRequestException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HttpRequest:�������������!");

	}
	/**
	 * ��һ������URI
	 */
	private void parseURI() {
		System.out.println("HttpRequest:��һ������!");
		/*
		 * uri��ֵ������û��Ĳ�ͬ�����в�ͬ���
		 * ���в����Ͳ�������
		 * 
		 * �������������:
		 * /myweb/index.html
		 * /myweb/logo.png
		 * ���в��������
		 * /myweb/reg?username=xxx&password=xx....
		 * 
		 * ���ں��в��������,������Ҫ��һ������URI
		 * 
		 * ʵ��˼·
		 * 1:�����ж�URI�Ƿ��в���(�ж��Ƿ���"?")
		 *   ��������в���,��ֱ�ӽ�URI��ֵ��
		 *   RequestURI����,�������账��
		 *   
		 * 2:������в���
		 *   ���Ƚ�URI����"?"���в��Ϊ��������(���󲿷ֺͲ�������)
		 *   Ȼ�����󲿷ָ�ֵ��RequestURI
		 *   �������ָ�ֵ��queryString
		 * 3:��һ�����queryString
		 *   ���䰴��"&"���Ϊ���ɲ���
		 *   ÿ����������"="���Ϊ�������Ͳ���ֵ
		 *   ������ΪKey��Value�浽parameter���Map����ɽ���
		 */
		if (uri.indexOf('?') == -1) {
			requestURI = uri;
		}else {
			String[] data = uri.split("\\?");
			requestURI = data[0];
			if (data.length > 1) {
				queryString = data[1];
				data = queryString.split("&");
				for (String s : data) {
					String[] mapData = s.split("=");
					parameters.put(mapData[0], mapData.length>1?mapData[1]:"");
				}
			}
		}
		
		System.out.println("requestURI:"+requestURI);
		System.out.println("queryString:"+queryString);
		System.out.println("parameters:"+parameters);
		System.out.println("HttpRequest:��һ���������!");
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
			if (c1 == HttpContext.CR&&c2 == HttpContext.LF) {
				break;
			}
			c1 = c2;
			str.append(c1);
		}
		return  str.toString().trim();
	}

	public String getRequestURI() {
		return requestURI;
	}

	public String getQueryString() {
		return queryString;
	}
	
	public String getParameter(String name) {
		return parameters.get(name);
	}
	
}
