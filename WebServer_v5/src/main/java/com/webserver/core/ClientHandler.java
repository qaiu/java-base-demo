package com.webserver.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

import com.webserver.http.HttpRequest;

/**
 * �ͻ��˴�����
 * ���ฺ����ָ���Ŀͻ��˽���
 * ����HTTPЭ�����,�ͻ�������������������������:
 * 1.��������
 * 2.��������
 * 3.��Ӧ�ͻ���
 * @author QAIU
 *
 */
public class ClientHandler implements Runnable{
	private Socket socket;
	private OutputStream os;
	public ClientHandler(Socket socket) {
		this.socket=socket;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			System.out.println("ClientHandler:��ʼ����");
			//1��������
			System.out.println("ClientHandler:��ʼ��������");
			HttpRequest request = new HttpRequest(socket);
			System.out.println("ClientHandler:�����������!");
			//2��������
			//2.1�����������,��ȡ�û��������Դ·��
			System.out.println("��ʼ��������");
			String path = request.getUri();
			System.out.println("path:"+path);
			System.out.println("�����������");
			
			//2.2:�����û��������Դ·��ȥwebapps��Ѱ�Ҷ�Ӧ����Դ
			File file = new File("./webapps"+path);
			if (file.exists()) {
				System.out.println("�ļ����ҵ�!");
				/*
				 * ���û�����ĸ���Դ�Ա�׼��Http��Ӧ��ʽ
				 * ���ͻؿͻ���
				 * 1:����״̬��
				 * 2:������Ӧͷ
				 * 3:������Ӧ����
				 */
				//ͨ��Socket��ȡ�����,���ڸ��ͻ��˷�����Ϣ
				OutputStream out = socket.getOutputStream();
				//1.���ͷ���״̬��
				String line = "HTTP/1.1 200 OK";
				out.write(line.getBytes("ISO8859-1"));
				os.write(13);
				os.write(10);
				//2.������Ӧͷ
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
				line = "Content-Type: text/html";
				out.write(line.getBytes("ISO8859-1"));
//				out.write(line.getBytes());

				out.write(13);
				out.write(10);
				
				line = "Content-Length:��"+file.length();
				out.write(line.getBytes("ISO8859-1"));
//				out.write(line.getBytes(""));

				out.write(13);
				out.write(10);
				
				//��������CRLF��ʾ��Ӧͷ�������
				out.write(13);
				out.write(10);
				
				//3.������Ӧ����
				FileInputStream fis = new FileInputStream(file);
				int len = -1;
				byte[] data = new byte[1024*10];
				while ((len = fis.read(data)) != -1) {
					out.write(data,0,len);
				}
				
				
			}else {
				System.out.println("�ļ�������!");
			}
			//3��Ӧ�ͻ���
			
			
			System.out.println("ClientHandler:�������");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			/*
			 * ����Ӧ��ͻ������Ӻ�
			 * ��ͻ��˶Ͽ�����
			 * �˲�����Http1.0Э���ͨ�ŷ�ʽ
			 * ���������Ϊ������һ�����������������
			 * ����Ӧ�������������
			 */
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
