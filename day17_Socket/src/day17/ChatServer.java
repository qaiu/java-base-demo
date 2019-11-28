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
				System.out.println("聊天服务器启动");
				while(true) {
					Socket s = ss.accept();
					System.out.println("一个客户端连接了");
					TongXinThread t = new TongXinThread(s);
					t.start();
				}
			} catch (Exception e) {
				System.out.println("8000端口被占用或服务异常终止");
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
			//获取远程地址
			InetSocketAddress addr = (InetSocketAddress)s.getRemoteSocketAddress();
			//获取远程地址的ip
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
				//接受昵称
				this.name = in.readLine();
				//发送欢迎信息
				send(name+",欢迎进入聊天室");
				
				//设置等待数据的超时时间
				s.setSoTimeout(3000);
				//把当前通信线程加入List集合
				synchronized (list) {
					list.add(this);
					sendAll(name + "进入聊天室,在线: " + list.size());
				}
				//群发上线信息
				//开始聊天
				String line = "";
				int count = 0;
				while(true) {
					try {
						line = in.readLine();//等待5秒,会超时
						count = 0;
					} catch (Exception e) {
						count++;
						if (count == 4) {
							send("*** 您已被踢出了聊天室 ***");
							s.close();
							break;
						}
						send("*** 请积极参与聊天("+count+"/3) ***");
						continue;
					}
					if (line == null) {
						break;
					}
					sendAll(name+"说:"+line);
					System.out.println(name + "("+clientIP+")说:" + line);
				}
				//null值循环结束,表示断开
			} catch (Exception e) {
				//readLine异常也表示断开
			}
			System.out.println(name+ "("+clientIP+")说:" + ",断开连接");
			//把当前通信线程移出List
			synchronized (list) {
				list.remove(this);
				//群发离线消息
				sendAll(name + "离开聊天室,在线: " + list.size());
			}
		}
		
	}

	public static void main(String[] args) {
		new ChatServer().new ServerThread().start();
	}
}
