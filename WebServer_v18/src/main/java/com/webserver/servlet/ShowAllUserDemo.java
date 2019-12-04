package com.webserver.servlet;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		byte[] data = new byte[32];
		for(int i = 0; i < raf.length() / 100; i++) {
			raf.read(data);
			String name = new String(data,"utf-8");

			raf.read(data);
			String pw = new String(data,"utf-8");

			raf.read(data);
			String nike = new String(data,"utf-8");

			int age = raf.readInt();
			System.out.println(name.trim()+","+pw.trim()+","+nike.trim()+","+age);
//			System.out.println("pos:"+raf.getFilePointer());
		}
		raf.close();
	}
}
