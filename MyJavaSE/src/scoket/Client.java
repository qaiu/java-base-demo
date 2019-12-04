package scoket;
/**
 * �����ҿͻ���
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
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Client {
	/*
	 * java.net.Socket �׽���
	 * Socket��װ��tcpͨѶϸ��,������ʹ��
	 * TCPЭ������̨�����(�ͻ���������
	 * ����)֮�������Ķ�д�������.
	 */
	private Socket socket;

	/**
	 * ��ʼ���ͻ���
	 */
	public Client() {
		try {
			/*
			 * ʵ����Socket�Ĺ��̾��������˽������ӵĹ���
			 * ������Ҫ������������:
			 * 1:��������ַ��Ϣ(IP��ַ)
			 * 2:�������Ķ˿ں�
			 * ����ͨ��IP�����ҵ������ϵķ�������ڵļ����
			 * ͨ���˿ڿ����ҵ������ڸû����ϵķ���˳���
			 */
			System.out.println("�������ӷ����...");
			//			socket = new Socket("192.168.43.90",8088);
			socket = new Socket("127.0.0.1",8088);
			System.out.println("�����ӷ����");

		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			/*
			 * OutputStream getOutputStream()
			 * ͨ��Socket��ȡһ�������,ͨ�����������
			 * д�����ֽڻᷢ�͸�Զ�˼����
			 */

			OutputStream out = socket.getOutputStream();//�ֽ������
			OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");//�ַ�ת��������
			BufferedWriter bw = new BufferedWriter(osw);//���������
			PrintWriter pw = new PrintWriter(bw,true);//�Զ���ˢ�������

			Scanner scan = new Scanner(System.in);
			while(true) {
				pw.println(LocalTime.now().format(DateTimeFormatter.ofPattern("(HH:mm:ss)"))+
						":"+
						scan.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
