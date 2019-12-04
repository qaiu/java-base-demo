package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) throws Exception{
//		Socket s = new Socket("172.18.2.150", 8000);
		Socket s = new Socket("localhost", 8000);
		Scanner scan = new Scanner(System.in);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"),true);
		while(true) {
			System.out.println("请发送消息");
			out.println(scan.nextLine());
			System.out.println("发送消息完毕");
			System.out.println("收到消息:"+in.readLine());
//			in.readLine();
			
			
		}
	}
}
