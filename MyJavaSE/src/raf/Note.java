package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求输入文件名，然后对该文件
 * 进行写操作
 * 之后控制台顺序每行字符串都顺序写入这个文件中
 * 当输入exit时程序退出
 * 写入的文件统一编码为utf-8
 * @author QAIU
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		System.out.println("请输入文件名：");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(name, "rw");
		String str;
		System.out.println("请输入文本");
		while (!("exit").equals(str=scan.next())) {
			raf.write((str+"\n").getBytes("utf-8"));
		}
		raf.close();
		scan.close();
		System.out.println("已退出");
		
		RandomAccessFile r = new RandomAccessFile(name, "r");
		while ((str = r.readLine()) != null) {
			System.out.println(new String(
					str.getBytes("ISO-8859-1"),"utf-8"));
		}
		
		r.close();
	}
}
