package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע�Ṧ��
 * ����������Ҫ���û����룺�û��� ���� �ǳ� ����
 * Ȼ���û�������Ϣд�� user.dat �ļ�����
 * ÿ���¼�̶�ռ��100�ֽ�
 * �����û��� ���� �ǳ� ��ռ 32�ֽ�
 * ���� int �̶�4�ֽ�
 * 
 * �ַ����������ױ����޸ģ����ҳ���ͳһ��ȡҲ����
 * @author QAIU
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭע��");
		System.out.println("����������");
		String name = scan.nextLine();
		System.out.println("����������");
		String pw = scan.nextLine();
		System.out.println("�������ǳ�");
		String nickname = scan.nextLine();
		System.out.println("����������");
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
