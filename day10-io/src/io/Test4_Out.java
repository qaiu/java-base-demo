package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Test4_Out {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("1.txt");
		pw.println("ok");
		
		pw.close();
//		method();//字节输出
//		method2();
	}
	//字节输出
	private static void method() throws Exception {
		//1. 创建字节流对象
//		Writer out = new BufferedWriter(
//				        new OutputStreamWriter(
//				        	new FileOutputStream(
//				        		new File("./1.txt"))));
//		out.write(49);
//		out.write(50);
//		out.write(51);
//		out.close();
		File file = new File("./1.txt");
		FileOutputStream fos = new FileOutputStream(file); //文件输出流
		OutputStreamWriter osw = new OutputStreamWriter(fos); //字符转换流
		Writer bw = new BufferedWriter(osw);  //字符缓冲流
//		PrintWriter pw = new PrintWriter(bw,true); //字符打印流带有行刷新的缓冲流
//
		bw.write(49);
		bw.write(50);
		bw.write(51);
		bw.close();
	}
	
	private static void method2() throws Exception{
		Reader in = new BufferedReader(
						new InputStreamReader(
							new FileInputStream(
									new File("./1.txt")),"utf-8"));
		int b = 0;
		while((b = in.read()) != -1) {
			System.out.print((char)b);
		}
		in.close();
	}
}
