package day16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("服务端已经在8000端口上启动");
		System.out.println("开始等待客户端连接");
		//暂停等在客户端发起连接,连接成功后返回插在服务端的插头对象
		Socket s = ss.accept();
		System.out.println("客户端已连接");
		
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		/*
		 * 通讯协议:通讯的流程和数据格式
		 * 		1. 接收 "hello"
		 * 		2. 发送 "world"
		 */
		for (int i = 0; i < 5; i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		
		out.write("world".getBytes());
		out.flush(); //刷新缓存
		
		s.close(); //断开连接
		ss.close(); //停止服务 释放8000 端口
		
		
		
	}
	
	
}
