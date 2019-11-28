package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 * @author QAIU
 *
 */

public class ReadStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("123.txt", "r");
		byte[] data = new byte[(int)raf.length()];
		raf.read(data);
		String str = new String(data,"utf-8");
		System.out.println(str);
		raf.close();
	}
}
