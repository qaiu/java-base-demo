package com.webserver.core;

import java.io.InputStream;
import java.net.Socket;

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
			InputStream in = socket.getInputStream();
			int d = -1;
			while ((d = in.read()) != -1) {
				System.out.print((char)d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
