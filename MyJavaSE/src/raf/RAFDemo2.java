package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./rad.dat", "r");
		/*
		 * int read()
		 * 读取1字节 以int返回 只读取低八位的数据 其余是0
		 * 如果返回-1 表示读取到了文件末尾
		 * 高							低
		 * 00000000 00000000 00000001 00000000
		 * 
		 * 00000000 00000000 00000000 00000000 
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
