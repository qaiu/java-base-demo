package day16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("172.18.2.2", 8000);
		
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		//����hello
		out.write("Hell".getBytes());
		out.flush();
		
		//���տͻ���
		for (int i = 0; i < 5; i++) {
			System.out.print((char)in.read());
		}
		
		//�Ͽ�����
		s.close();
	}
}
