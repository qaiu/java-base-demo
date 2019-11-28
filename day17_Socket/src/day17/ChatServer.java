package day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	ArrayList<TongXinThread> list = new ArrayList<>();
	class ServerThread extends Thread{
		@Override
		public void run() {
			try (ServerSocket ss = new ServerSocket(8000)) {
				System.out.println("�������������");
				while(true) {
					Socket s = ss.accept();
					System.out.println("һ���ͻ���������");
					TongXinThread t = new TongXinThread(s);
					t.start();
				}
			} catch (Exception e) {
				System.out.println("8000�˿ڱ�ռ�û�����쳣��ֹ");
				e.printStackTrace();
			}
		}
	}
	
	class TongXinThread extends Thread{
		Socket s;
		BufferedReader in;
		PrintWriter out;
		private String name;
		private String clientIP;
		public TongXinThread(Socket s) {
			this.s = s;
			//��ȡԶ�̵�ַ
			InetSocketAddress addr = (InetSocketAddress)s.getRemoteSocketAddress();
			//��ȡԶ�̵�ַ��ip
			this.clientIP = addr.getHostString();
		}
		
		private void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		synchronized private void sendAll(String msg) {
			for (TongXinThread t : list) {
				t.send(msg);
			}
		}
		
		@Override
		public void run() {
			try {
				this.in = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
				this.out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"));
				//�����ǳ�
				this.name = in.readLine();
				//���ͻ�ӭ��Ϣ
				send(name+",��ӭ����������");
				
				//���õȴ����ݵĳ�ʱʱ��
				s.setSoTimeout(3000);
				//�ѵ�ǰͨ���̼߳���List����
				synchronized (list) {
					list.add(this);
					sendAll(name + "����������,����: " + list.size());
				}
				//Ⱥ��������Ϣ
				//��ʼ����
				String line = "";
				int count = 0;
				while(true) {
					try {
						line = in.readLine();//�ȴ�5��,�ᳬʱ
						count = 0;
					} catch (Exception e) {
						count++;
						if (count == 4) {
							send("*** ���ѱ��߳��������� ***");
							s.close();
							break;
						}
						send("*** �������������("+count+"/3) ***");
						continue;
					}
					if (line == null) {
						break;
					}
					sendAll(name+"˵:"+line);
					System.out.println(name + "("+clientIP+")˵:" + line);
				}
				//nullֵѭ������,��ʾ�Ͽ�
			} catch (Exception e) {
				//readLine�쳣Ҳ��ʾ�Ͽ�
			}
			System.out.println(name+ "("+clientIP+")˵:" + ",�Ͽ�����");
			//�ѵ�ǰͨ���߳��Ƴ�List
			synchronized (list) {
				list.remove(this);
				//Ⱥ��������Ϣ
				sendAll(name + "�뿪������,����: " + list.size());
			}
		}
		
	}

	public static void main(String[] args) {
		new ChatServer().new ServerThread().start();
	}
}
