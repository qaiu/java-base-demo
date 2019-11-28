package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入文本数据
 * @author QAIU
 *
 */
public class WriteStringDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf =  new RandomAccessFile("./raf.txt", "rw");
		String str = "这是一句话";
		raf.write(str.getBytes("utf-8"));
		raf.write("h哈哈哈哈哈哈哈哈hhhhhhh\n韩红会画画后悔画韩寒\n6666666".getBytes("utf-8"));
		System.out.println(str.getBytes().length);
		System.out.println(str.getBytes("utf-8").length);
		System.out.println(str.getBytes("gb231").length);
		raf.close();
	}
}
