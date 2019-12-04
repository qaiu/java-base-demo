package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author QAIU
 *
 */
public class BOS_flushDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "ooooooooooook~";
		bos.write(str.getBytes("GBK"));
		/*
		 * void flush()
		 * 该方法是OutputStream定义的方法，
		 * 但并非所有字节输出流都实现了该方法的功能
		 * 只有缓冲流的该方法有实际意义
		 * 作用是一次性将缓冲区已存在的数据写出
		 * 之所以所有的字节流都有该方法是因为
		 * 流连接应用中缓冲流通常不是"终端流"（直接被我们操作的流）
		 * 为了传递刷新缓冲区功能才有
		 */
		bos.flush();
		System.out.println("写入完毕");
		bos.close();
		
	}
}
