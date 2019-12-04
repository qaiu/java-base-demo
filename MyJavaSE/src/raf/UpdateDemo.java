package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改用户昵称
 * 程序启动后要求用户输入用户名和新昵称
 * 然后将user.dat的昵称修改
 * @author QAIU
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		
		byte[] data = new byte[32];
		boolean flag = false;
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			raf.read(data);
			if (username.equals(new String(data,"utf-8").trim())) {
				flag = true;
				System.out.println("请输入昵称：");
				String nikename = scanner.nextLine();
				raf.seek(i*100+32*2);
				raf.write(Arrays.copyOf(nikename.getBytes("utf-8"), 32));
				System.out.println("修改完毕");
				break;
			}
		}
		if (!flag) {
			System.out.println("查无此人！");
		}
		raf.close();
		scanner.close();
	}

}
