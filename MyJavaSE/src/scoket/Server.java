package scoket;
/**
 * 聊天室服务端
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
	 * 运行在服务端的ServerSocket主要有两个工作
	 * 1:向服务端申请端口号,客户端就是通过
	 *   这个端口和服务端建立链接的
	 * 2:建厅服务端口,一旦客户端连接了
	 *   就会自动创建一个Socket实例
	 *   通过Socket就可以与服务端交互了
	 */

	// 初始化服务端
	public Server() {
		try {
			System.out.println("正在启动服务端");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕");
			
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 服务端开始工作
	public void start() {
		try {
			/*
			 * Socket accept()
			 * ServerSocket提供的该方法等待客户端的连接
			 * 一旦一个客户建立连接 该方法会立刻返回一个
			 * Socket实例,通过该实例就可以与客户端交互了
			 * 
			 * 多次调用该方法会等待多个客户端
			 */
			while(true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();

				System.out.println("客户端连接~~~");
				//创建一个线程处理该客户端
				Thread t1 = new Thread(new ClientHandler(socket));
				t1.start();
				/*
				 * InputStream getInputStream()
				 * 通过Socket获取输入读取的字节
				 * 是远端计算机发过来的字节
				 */

			}
		} catch (IOException e) {
			System.out.println("客户端异常退出");
			
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	private class ClientHandler implements Runnable{
		Socket socket;
		//记录客户端地址信息
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
				 * 使用BufferedReader读取客户端发送过来的一
				 * 行字符串时,当客户端断开连接,此时客户端的系
				 * 统不同反应也会不同
				 * 
				 * 当windows的客户端断开时,readline方法通常会抛出SocketException
				 * 当Linux系统断开时 readline方法会返回null
				 */
				while((message = bf.readLine())!=null) {
					System.out.println(host+":"+message);
				}
				System.out.println("客户端退出");
				socket.close();
				bf.close();
			} catch (Exception e) {
				
			}
		}
		
	}
}
