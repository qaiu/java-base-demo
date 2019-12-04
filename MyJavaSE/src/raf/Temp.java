package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String user = scanner.nextLine();
		
		System.out.println("请输入昵称");
		String nick = scanner.nextLine();
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			byte[] data= new byte[32];
			raf.read(data);
			if (new String(data, "utf-8").trim().equals(user)) {
				raf.seek(i*100+64);
				raf.write(Arrays.copyOf(nick.getBytes("utf-8"), 32));
			}
		}
	}
}
