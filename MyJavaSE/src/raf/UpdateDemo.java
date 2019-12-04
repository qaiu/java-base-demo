package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��û��ǳ�
 * ����������Ҫ���û������û��������ǳ�
 * Ȼ��user.dat���ǳ��޸�
 * @author QAIU
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���");
		String username = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		
		byte[] data = new byte[32];
		boolean flag = false;
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			raf.read(data);
			if (username.equals(new String(data,"utf-8").trim())) {
				flag = true;
				System.out.println("�������ǳƣ�");
				String nikename = scanner.nextLine();
				raf.seek(i*100+32*2);
				raf.write(Arrays.copyOf(nikename.getBytes("utf-8"), 32));
				System.out.println("�޸����");
				break;
			}
		}
		if (!flag) {
			System.out.println("���޴��ˣ�");
		}
		raf.close();
		scanner.close();
	}

}
