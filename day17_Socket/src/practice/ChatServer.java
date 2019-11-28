package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class ChatServer {
	static ArrayList<communicationThread> list = new ArrayList<>();

	static public class communicationThread implements Runnable{
		Socket s;
		BufferedReader in;
		PrintWriter out;
		String name;
		String destUser;
		String clientIP;
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClientIP() {
			return clientIP;
		}

		public communicationThread(Socket s) {
			this.s = s;
//			clientIP = ((InetSocketAddress)s.getRemoteSocketAddress()).getHostName();
			InetSocketAddress addr = (InetSocketAddress)s.getRemoteSocketAddress();
			this.clientIP = addr.getHostString();
		}
		
		@Override
		public void run() {
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
				out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"),true);
				
				name = in.readLine();
				send(name+",��ӭ����������, ʹ��˵��:\n\t˽��ģʽ: #�û���\n\t��ΪȺ��ģʽ:  :set all\n\t@��Ա:@�û���");
				s.setSoTimeout(10*60*1000); //��ʱʱ��Ϊ10����
				synchronized (list) {
					list.add(this);
					sendAll(name+"�Ѽ���,��ǰ��������"+list.size()+"��");
				}
				String line = "";
				int count = 0;
				while(true) {
					try {
						if((line = in.readLine()) == null){
							break;
						}
						count = 0;
					} catch (SocketTimeoutException e) {
						System.out.println(name+"("+clientIP+")������");
						count++;
						if(count == 4) {
							System.out.println(name+"("+clientIP+")�����������");
							send("��ϲ�����һ�ŷɻ�Ʊ!");
							s.close();
							break;
						}
						send("ϵͳ��ʾ"+count+"/3: ���������!");
						continue;
					}
					
					System.out.println(name+"("+clientIP+")˵:"+line);
					
					if (line.length()<2) {
						continue;
					}
					
					if (line.charAt(0) == '@') {
						int index = -1;
						if((index = line.indexOf(' ')) != -1) {
							sendAt(line.substring(1, index), line.substring(index+1));
						} else {
							send("@��ʽ����");
						}
						continue;
					}else if(line.charAt(0) == '#'){
						checkDestUser(line.substring(1));
						continue;
					} else if(":set all".equals(line)){
						send("���ѳɹ�����Ⱥ��ģʽ");
						destUser = null;
						continue;
					}
					
					if(destUser == null) {
						sendAll(name+"˵:"+line);
					} else {
						sendPrivateMsg(name+"(˽��)˵:"+line);
					}
				}
			} catch (Exception e) {
				System.err.println("readLine�쳣");
				e.printStackTrace();
			}
			System.out.println(name+"("+clientIP+")�뿪������");
			synchronized (list) {
				list.remove(this);
				sendAll(name+"�뿪������,��ǰ��������"+list.size()+"��");
			}
		}

		private void send(String msg) {
			out.println(msg);
		}

		synchronized private void sendAll(String msg) {
			for (communicationThread c : list) {
				c.send(msg);
			}
		}
		
		synchronized private void sendAt(String destUser, String msg) {
			boolean flag = false;
			for (communicationThread c : list) {
				if (destUser.equals(c.getName())) {
					c.send("*** ϵͳ��ʾ: ����@��һ��\n ***");
					c.send(msg);
					flag = true;
				}else {
					c.send(msg);
				}
			}
			if (!flag) {
				send("*** ϵͳ��ʾ: �û�"+destUser+"������! ***");
			}
		}
		
		public void setDestUser(String destUser) {
			this.destUser = destUser;
		}

		synchronized private void checkDestUser(String destUser) {
			for (communicationThread c : list) {
				if (destUser.equals(c.getName())) {
					setDestUser(destUser);
					c.setDestUser(getName());
					send("*** ϵͳ��ʾ: ���Ѻ�"+destUser+"����˽��ģʽ! ***");
					c.send("*** ϵͳ��ʾ: ���Ѻ�"+getName()+"����˽��ģʽ! ***");
					return;
				}
			}
			send("*** ϵͳ��ʾ: �û�"+destUser+"������! ***");
		}
		
		synchronized private void sendPrivateMsg(String msg) {
			for (communicationThread c : list) {
				if (destUser.equals(c.getName())) {
					c.send(msg);
					break;
				}
			}
		}
		
	}
	
	static void launch() {
		new Thread(()->{
			try (ServerSocket ss = new ServerSocket(8000)){
				System.out.println("�������Ѿ�����");
				while(true) {
					Socket s = ss.accept();
					System.out.println("һ���ͻ���������");
					new Thread(new communicationThread(s)).start();
				}
			} catch (Exception e) {
				System.out.println();
				e.printStackTrace();
			}
		}).start();
	}
	 
	public static void main(String[] args) {
		launch();
	}

}
