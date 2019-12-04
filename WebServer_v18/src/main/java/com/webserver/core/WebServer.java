package com.webserver.core;
/**
 * WebServer��ģ��Tomcat��һ��������
 * 
 * web������ְ���кܶ�,��Ҫ��:
 * 1:��ͻ���(ͨ��ָ�����)ά��TCP����
 *   �Լ�����HTTPЭ���Ӧ�ý�������
 * 2:������Webapp,ÿ��webapp��һ������Ӧ��
 *   ����Ӧ�˰�����:��ҳ,��̬��Դ,ҵ�����(Java����)
 *   ������
 * @author QAIU
 *
 */

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
	private ServerSocket server;
	private ExecutorService threadPool;
	
	public WebServer() {
		try {
			System.out.println("�������������...");
			server = new ServerSocket(8088);
			threadPool = Executors.newFixedThreadPool(500);
			System.out.println("������������!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			//��ʱ���ý��ն�οͻ�������
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("һ���ͻ���������!");
				//����һ���̴߳���ͻ��˽���
				ClientHandler handler = new ClientHandler(socket);
				threadPool.execute(handler);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}
}
