package scoket1;
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

		/*
		 * Socket accept()
		 * ServerSocket�ṩ�ĸ÷����ȴ��ͻ��˵�����
		 * һ��һ���ͻ��������� �÷��������̷���һ��
		 * Socketʵ��,ͨ����ʵ���Ϳ�����ͻ��˽�����
		 * 
		 * ��ε��ø÷�����ȴ�����ͻ���
		 */
		while(true) {
			try {
				System.out.println("�ȴ��ͻ�������...");
				Socket socket = server.accept();
				System.out.println("�ͻ���������~~~");
				new Thread() {
					public void run() {
						/*
						 * InputStream getInputStream()
						 * ͨ��Socket��ȡ�����ȡ���ֽ�
						 * ��Զ�˼�������������ֽ�
						 */	
						try {
							InputStream in = socket.getInputStream(); //�ֽ�������
							InputStreamReader isr = new InputStreamReader(in,"utf-8"); //�ַ�ת��������
							BufferedReader bf = new BufferedReader(isr); //����������
//
//							OutputStream out = socket.getOutputStream();//�ֽ������
//							OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");//�ַ�ת��������
//							BufferedWriter bw = new BufferedWriter(osw);//���������
//							PrintWriter pw = new PrintWriter(bw,true);//�Զ���ˢ�������

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
								System.out.println(""+message);
//								pw.println("����� "+
//										LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))+
//										":"+
//										scan.nextLine());
							}
							System.out.println("�ͻ��˷��˳�");
							socket.close();
							bf.close();
						} catch (Exception e) {
							System.out.println("�ͻ����쳣");
						}
					};
				}.start();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}
