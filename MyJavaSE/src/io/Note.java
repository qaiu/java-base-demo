package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入文件名，之后将用户输入
 * 的每一行字符串按行写入该文件，单独输入exit
 * 时退出
 * 使用PW完成按行写入文本数据操作
 * 要求 独立完成流连接操作
 * @author QAIU
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名");
		String filename = scanner.nextLine();

		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(filename),"gbk")),true);

		System.out.println("请输入每一行文本，按exit退出");

		String str;
		while(!"exit".equals(str = scanner.nextLine())) {
			pw.println(str);
		}
		pw.close();


		System.out.println("已退出，欢迎下次使用");

	}
}
