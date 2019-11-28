package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门处理读写文件数据的API，其基于指针
 * 对文件数据任意位置进行读写.
 * @author QAIU
 *
 */

public class RAFDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * 创建RAF有两个常用的构造方法
		 * RandomAccessFile(File f, String mode);
		 * RandomAccessFile(String path, String mode);
		 * 第二个参数为操作模式，有：
		 * "r"：只读模式，仅对文件做读操作
		 * "rw"：读写模式，对文件数据可读可写
		 */
		RandomAccessFile raf = new RandomAccessFile("./rad.dat", "rw");
		raf.write(-2);
		//raf.writeUTF("123oooooooooooo");
		raf.close();
		
	}
}
