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
			System.out.println("�뷢����Ϣ");
			out.println(scan.nextLine());
			System.out.println("������Ϣ���");
			System.out.println("�յ���Ϣ:"+in.readLine());
//			in.readLine();
			
			
		}
	}
}
