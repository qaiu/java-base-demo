package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ļ���д���ı�����
 * @author QAIU
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf =  new RandomAccessFile("./raf.txt", "rw");
		String str = "����һ�仰";
		raf.write(str.getBytes("utf-8"));
		raf.write("h����������������hhhhhhh\n����ử����ڻ�����\n6666666".getBytes("utf-8"));
		System.out.println(str.getBytes().length);
		System.out.println(str.getBytes("utf-8").length);
		System.out.println(str.getBytes("gb231").length);
		raf.close();
	}
}
