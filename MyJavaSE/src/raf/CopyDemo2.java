package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量，减少实际读写的次数
 * 是可以提高读写效率的
 * 单字节读写是随机读写
 * 一组字节读写是块读写
 * @author QAIU
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		/*
		 * int read(byte[] data)
		 * 一次性读取给定
		 */
		RandomAccessFile src = new RandomAccessFile("C:\\Users\\QAIU\\Desktop\\javarun\\3DGameDemo.zip", "r");
		RandomAccessFile desc = new RandomAccessFile("C:\\Users\\QAIU\\Desktop\\javarun\\a.zip","rw");
		
		byte[] b = new byte[1024*10];
		int len = -1;
		long t = System.currentTimeMillis();
		while ((len = src.read(b)) != -1 ) {
			desc.write(b, 0, len);
		}
		t = System.currentTimeMillis() - t;
		System.out.println("复制完毕，耗时："+t+"毫秒");
		src.close();
		desc.close();
	}
}
