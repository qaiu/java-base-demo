package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将按照读写单位分为：字节流和字符流
 * 字节流：以字节为单位，一次至少读写8位二进制
 * 字符流：以字符为单位读写数据，由实际读写的字节量与
 * 指定的字符集与读写的字符数据有关
 * 但是在java内部表示字符数据时都是用char表示（2字节）
 * 
 * java.io.Writer,java.io.Reader
 * 上面两个类是抽象类，是所有字符输出流和字符输入流的超类
 * 里面规定了读写字符相关的方法
 * 
 * 字符转换流，他们是字符流的一对常用实现类，是一对高级流
 * 实际开发中我们在读写文本数据时，它们是流连接中重要的一环
 * 但是我们不会直接操作这对流
 * 
 * @author QAIU
 *
 */

public class OSWDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		/*
		 * 转换流在创建时通过指定第二个参数来确
		 * 定字符集，这样通过当前流写出文本时
		 * 都会按照该字符集转换为字节后再做写出
		 */
		String string = "是兄弟就来砍我~~~~~~";
		osw.write(string);
		
		osw.close();
		System.out.println("输出完毕");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
