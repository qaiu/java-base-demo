package scoket;
/**
 * �����ҷ����
 * @author QAIU
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Server {
	private ServerSocket server;
	/*
	 * java.net.ServerSocket
	 * �����ڷ���˵�ServerSocket��Ҫ����������
	 * 1:����������˿ں�,�ͻ��˾���ͨ��
	 *   ����˿ںͷ���˽������ӵ�
	 * 2:��������˿�,һ���ͻ���������
	 *   �ͻ��Զ�����һ��Socketʵ��
	 *   ͨ��Socket�Ϳ��������˽�����
	 */

	// ��ʼ�������
	public Server() {
		try {
			System.out.println("�������������");
			server = new ServerSocket(8088);
			System.out.println("������������");
			
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	// ����˿�ʼ����
	public void start() {
		try {
			/*
			 * Socket accept()
			 * ServerSocket�ṩ�ĸ÷����ȴ��ͻ��˵�����
			 * һ��һ���ͻ��������� �÷��������̷���һ��
			 * Socketʵ��,ͨ����ʵ���Ϳ�����ͻ��˽�����
			 * 
			 * ��ε��ø÷�����ȴ�����ͻ���
			 */
			while(true) {
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();

				System.out.println("�ͻ�������~~~");
				//����һ���̴߳���ÿͻ���
				Thread t1 = new Thread(new ClientHandler(socket));
				t1.start();
				/*
				 * InputStream getInputStream()
				 * ͨ��Socket��ȡ�����ȡ���ֽ�
				 * ��Զ�˼�������������ֽ�
				 */

			}
		} catch (IOException e) {
			System.out.println("�ͻ����쳣�˳�");
			
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	private class ClientHandler implements Runnable{
		Socket socket;
		//��¼�ͻ��˵�ַ��Ϣ
		String host;
		public ClientHandler(Socket socket) {
			this.socket = socket;
			host = socket.getInetAddress().getHostAddress();
		}
		@Override
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"utf-8");
				BufferedReader bf = new BufferedReader(isr);

				Scanner scan = new Scanner(System.in);
				String message;
				/*
				 * ʹ��BufferedReader��ȡ�ͻ��˷��͹�����һ
				 * ���ַ���ʱ,���ͻ��˶Ͽ�����,��ʱ�ͻ��˵�ϵ
				 * ͳ��ͬ��ӦҲ�᲻ͬ
				 * 
				 * ��windows�Ŀͻ��˶Ͽ�ʱ,readline����ͨ�����׳�SocketException
				 * ��Linuxϵͳ�Ͽ�ʱ readline�����᷵��null
				 */
				while((message = bf.readLine())!=null) {
					System.out.println(host+":"+message);
				}
				System.out.println("�ͻ����˳�");
				socket.close();
				bf.close();
			} catch (Exception e) {
				
			}
		}
		
	}
}
