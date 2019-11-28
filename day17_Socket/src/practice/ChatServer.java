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
				send(name+",欢迎来到聊天室, 使用说明:\n\t私信模式: #用户名\n\t改为群聊模式:  :set all\n\t@成员:@用户名");
				s.setSoTimeout(10*60*1000); //超时时间为10分钟
				synchronized (list) {
					list.add(this);
					sendAll(name+"已加入,当前在线人数"+list.size()+"人");
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
						System.out.println(name+"("+clientIP+")被警告");
						count++;
						if(count == 4) {
							System.out.println(name+"("+clientIP+")被请出聊天室");
							send("恭喜您获得一张飞机票!");
							s.close();
							break;
						}
						send("系统提示"+count+"/3: 请积极发言!");
						continue;
					}
					
					System.out.println(name+"("+clientIP+")说:"+line);
					
					if (line.length()<2) {
						continue;
					}
					
					if (line.charAt(0) == '@') {
						int index = -1;
						if((index = line.indexOf(' ')) != -1) {
							sendAt(line.substring(1, index), line.substring(index+1));
						} else {
							send("@格式错误");
						}
						continue;
					}else if(line.charAt(0) == '#'){
						checkDestUser(line.substring(1));
						continue;
					} else if(":set all".equals(line)){
						send("您已成功开启群聊模式");
						destUser = null;
						continue;
					}
					
					if(destUser == null) {
						sendAll(name+"说:"+line);
					} else {
						sendPrivateMsg(name+"(私信)说:"+line);
					}
				}
			} catch (Exception e) {
				System.err.println("readLine异常");
				e.printStackTrace();
			}
			System.out.println(name+"("+clientIP+")离开聊天室");
			synchronized (list) {
				list.remove(this);
				sendAll(name+"离开聊天室,当前在线人数"+list.size()+"人");
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
					c.send("*** 系统提示: 有人@你一下\n ***");
					c.send(msg);
					flag = true;
				}else {
					c.send(msg);
				}
			}
			if (!flag) {
				send("*** 系统提示: 用户"+destUser+"不存在! ***");
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
					send("*** 系统提示: 您已和"+destUser+"开启私聊模式! ***");
					c.send("*** 系统提示: 您已和"+getName()+"开启私聊模式! ***");
					return;
				}
			}
			send("*** 系统提示: 用户"+destUser+"不存在! ***");
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
				System.out.println("聊天室已经启动");
				while(true) {
					Socket s = ss.accept();
					System.out.println("一个客户端上线了");
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
