package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流，用于读取文件数据
 * 
 * 文件流与RAF放入区别
 * 1：RAF是基于指针的随机读写，读写方式更灵活
 * 并且可以对文件部分内容覆盖进行编辑操作
 * 而文件流则不行，文件流是基于java标准IO
 * 的操作方式，而IO读写为顺序读写，
 * 即只能向后读写操作不能回退
 * 
 * 2：文件流可以借助流连接完成复杂
 * 读写操作，这一点是RAF做不到的
 * @author QAIU
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fis.read(data);
		System.out.println("实际读取到了："+len+"字节");
		/*
		 * String(byte[] data,int offset,int len,string csn)
		 * 将给定的字符数组中
		 * 将给定字符数组从下标offset
		 * 处的连续len个字节按照指定的字符集转为字符串
		 */
		String line = new String(data,0,len,"gbk");
		System.out.println(line);
	}
}
