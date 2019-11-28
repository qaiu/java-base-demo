package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能
 * 程序启动后要求用户输入：用户名 密码 昵称 年龄
 * 然后用户输入信息写入 user.dat 文件保存
 * 每天记录固定占用100字节
 * 其中用户名 密码 昵称 各占 32字节
 * 年龄 int 固定4字节
 * 
 * 字符串故意留白便于修改，并且长度统一读取也方便
 * @author QAIU
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎注册");
		System.out.println("请输入姓名");
		String name = scan.nextLine();
		System.out.println("请输入密码");
		String pw = scan.nextLine();
		System.out.println("请输入昵称");
		String nickname = scan.nextLine();
		System.out.println("请输入年龄");
		int age = scan.nextInt();
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		raf.seek(raf.length());
		raf.write(Arrays.copyOf(name.getBytes("utf-8"), 32));
		raf.write(Arrays.copyOf(pw.getBytes("utf-8"), 32));
		raf.write(Arrays.copyOf(nickname.getBytes("utf-8"), 32));
		raf.writeInt(age);
		raf.close();
		
	}
}
