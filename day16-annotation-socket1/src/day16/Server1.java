package day16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("������Ѿ���8000�˿�������");
		System.out.println("��ʼ�ȴ��ͻ�������");
		//��ͣ���ڿͻ��˷�������,���ӳɹ��󷵻ز��ڷ���˵Ĳ�ͷ����
		Socket s = ss.accept();
		System.out.println("�ͻ���������");
		
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		/*
		 * ͨѶЭ��:ͨѶ�����̺����ݸ�ʽ
		 * 		1. ���� "hello"
		 * 		2. ���� "world"
		 */
		for (int i = 0; i < 5; i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		
		out.write("world".getBytes());
		out.flush(); //ˢ�»���
		
		s.close(); //�Ͽ�����
		ss.close(); //ֹͣ���� �ͷ�8000 �˿�
		
		
		
	}
	
	
}
