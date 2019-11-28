package scoket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver extends Thread{
	public static void main(String[] args) {
		server();
	}
	
	
	private Socket s;
	public Myserver(Socket s) {
		this.s = s;
	}
	
	
	@Override
	public void run() {
		try {
			// 可以利用套接字获取输出流、输入流
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			// 利用输出流向客户端发送数据
			// getBytes将字符串转换成字节数组
			os.write("Hello,welcome you,client!".getBytes());
			// 利用输入流从网络上读取数据
			// 建立字节数组
			byte[] buf = new byte[100];
			// 将数据读取到buf字节数组当中，它会返回实际读取的字节数
			int len = is.read(buf);
			// 将我们读取的数据打印出来
			System.out.println(new String(buf, 0, len));
			// 完成通信之后，我们可以将输出流、输入流、套接字、服务器端的套接字都关闭
			os.close();
			is.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	/**
	 * 服务器端程序的编写
	 */
	public static void server() {
		try {
			// 创建服务器端套接字，绑定到6000的端口上
			ServerSocket ss = new ServerSocket(6000);
			
			//当前为一个客户服务，要为多个客户同时服务加while循环监听客户端请求
			while (true) {
				// 调用accept方法就会阻塞，直到客户端有连接请求到来的时候。
				// 它会返回一个套接字，然后就可以利用这个套接字与客户端进行数据通信。
				Socket s = ss.accept();
				//一旦有一个连接请求到来，接收连接请求，返回套接字。
				//然后创建启动一个新的线程,将套接字传递给线程,为客户端进行服务  
				//Run执行完毕，当前线程也就终止了
				new Myserver(s).start(); 
			}
			//ss.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}