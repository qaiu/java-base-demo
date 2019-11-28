package day16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("172.18.2.2", 8000);
		
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		//发送hello
		out.write("Hell".getBytes());
		out.flush();
		
		//接收客户端
		for (int i = 0; i < 5; i++) {
			System.out.print((char)in.read());
		}
		
		//断开连接
		s.close();
	}
}
