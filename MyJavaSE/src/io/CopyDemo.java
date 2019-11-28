package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件复制操作
 * @author QAIU
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 1.创建文件输入流读取源文件
		 * 2.创建文件输出流写复制文件
		 * 3.循环读写，完成复制
		 */
		
		FileInputStream fis = new FileInputStream("\\jdk api 1.8_China");
		FileOutputStream fos = new FileOutputStream("out.exe");
		
		byte[] data = new byte[1024*8];
		int len = -1;
		while((len = fis.read(data))!=-1) {
			fos.write(data, 0, len);
		}
		System.out.println("复制完毕");
	}
}
