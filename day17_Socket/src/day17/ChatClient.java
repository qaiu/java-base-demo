package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ChatClient {

	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private String name;
	private Queue<String> q = new LinkedList<String>();
	private Scanner scan = new Scanner(System.in);
	private boolean inputFlag = false;
	
	public void launch(){
		try {
//			this.s = new Socket("172.18.2.144", 8000);
			this.s = new Socket("localhost", 8000);
			in = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"),true);
			System.out.println("�������ǳ�:");
			name = scan.nextLine();
			out.println(name);
			
			synchronized (q) {
				q.notify();
			}
			
//			System.out.println(in.readLine());
//			System.out.println(in.readLine());

			//�����߳�
			Thread t2 = new Thread(()->input());
			//��ӡ�߳�
			Thread t3 = new Thread(()->print());
			//�����߳�
			Thread t1 = new Thread(()->receive());
			t1.start();
			t2.start();
			t3.start();
		} catch (Exception e) {
			System.out.println("�޷����������ҷ�����");
			e.printStackTrace();
		}
	}

	private void print() {
		while(true) {
			synchronized (q) {
				while(q.isEmpty()||inputFlag) {
					try {
						q.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			String msg = q.poll();
			System.out.println(msg);
		}
	}

	protected void input() {
		System.out.println("���س�������Ϣ");
		try {
			while(true) {
				scan.nextLine();
				inputFlag = true;
				System.out.println("������:");
				out.println(scan.nextLine());
				inputFlag = false;
				System.out.println("������Ϣ���");
				synchronized (q) {
					q.notify();
				}
			}
		} catch (Exception e) {
			System.out.println("�������ر�");
		}
		System.out.println("�����˳�...");
	}

	protected void receive() {
		String line;
		try {
			while((line = in.readLine()) != null) {
				synchronized (q) {
					q.offer(line);
					q.notify();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�Ѿ��ͷ������Ͽ�����");
		System.exit(0);
	}
	
	public static void main(String[] args) throws Exception{
		new ChatClient().launch();
	}
}
