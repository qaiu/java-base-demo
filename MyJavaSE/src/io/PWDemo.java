package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 以上两个就是缓冲字符输入与输出流
 * 是一对高级流，内部有缓冲区读写
 * 文本数据效率高
 * 
 * java.io.PrintWriter
 * 内部总是连接BufferedWriter作为缓冲加速使用
 * 并且PW还支持自动刷新功能，实际开发比较常用
 * @author QAIU
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter提供了对文件直接写操作的构造器
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 * 并且上面的构造器还支持一个重载，第二个参数
		 * 是字符集名称，这样可以按照指定的字符集名称写出文本数据
		 */
		PrintWriter pw = new PrintWriter("pw.txt","GBK");
		pw.println("写入换行");
		pw.print("不换行");
		pw.println("换行了");
		pw.close();
	}
}
