package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * ���׼��±�����
 * ����������Ҫ�������ļ�����Ȼ��Ը��ļ�
 * ����д����
 * ֮�����̨˳��ÿ���ַ�����˳��д������ļ���
 * ������exitʱ�����˳�
 * д����ļ�ͳһ����Ϊutf-8
 * @author QAIU
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		System.out.println("�������ļ�����");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		RandomAccessFile raf = new RandomAccessFile(name, "rw");
		String str;
		System.out.println("�������ı�");
		while (!("exit").equals(str=scan.next())) {
			raf.write((str+"\n").getBytes("utf-8"));
		}
		raf.close();
		scan.close();
		System.out.println("���˳�");
		
		RandomAccessFile r = new RandomAccessFile(name, "r");
		while ((str = r.readLine()) != null) {
			System.out.println(new String(
					str.getBytes("ISO-8859-1"),"utf-8"));
		}
		
		r.close();
	}
}
