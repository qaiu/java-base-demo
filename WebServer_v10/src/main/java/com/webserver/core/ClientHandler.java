package com.webserver.core;

import java.io.File;
import java.net.Socket;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

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
	public ClientHandler(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		try {
			System.out.println("ClientHandler:��ʼ����");
			//1��������
			System.out.println("ClientHandler:��ʼ��������");
			HttpRequest request = new HttpRequest(socket);
			HttpResponse response = new HttpResponse(socket);
			System.out.println("ClientHandler:�����������!");
			//2��������
			//2.1�����������,��ȡ�û��������Դ·��
			System.out.println("��ʼ��������");
			String path = request.getUri();
			System.out.println("path:"+path);
			System.out.println("�����������");
			
			//2.2:�����û��������Դ·��ȥwebapps��Ѱ�Ҷ�Ӧ����Դ
			File file = new File("./webapps"+path);
			if (file.exists() && file.isFile()) {
				System.out.println("�ļ����ҵ�:"+file.getName());
				//ʵ������Ӧ����
				response.setEntity(file);
			}else {
				File notFountPage = new File("./webapps/root/404.html");
				response.setStatusCode(404);
				response.setStatusReason("Not Fount");
				response.setEntity(notFountPage);		
			}
			//3��Ӧ�ͻ���
			System.out.println("ClientHandler:��ʼ������Ӧ!");
			response.flush();
			System.out.println("ClientHandler������Ӧ���!");
			
			
			System.out.println("ClientHandler:�������");
		} catch (Exception e) {
			e.printStackTrace();
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