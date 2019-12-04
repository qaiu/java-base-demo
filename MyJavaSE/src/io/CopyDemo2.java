package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * 缓存字节输入输出流 是一对高级流，
 * 在流连接的作用是提高读写效率
 * （内部维护了一个8K的字节数组，
 * 并将读写的数据转换成块读写从而提高效率）
 * @author QAIU
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\jdk api 1.8_China\\使用说明.docx");
		FileOutputStream fos = new FileOutputStream("使用说明1.docx");
		
		BufferedInputStream bif = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data = -1;
		while((data = bif.read())!=-1) {
			bos.write(data);
		}
		System.out.println("复制完毕！");
		bif.close();
		bos.close();
	}
}
