package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ���׼��±�����
 * ����������Ҫ���û������ļ�����֮���û�����
 * ��ÿһ���ַ�������д����ļ�����������exit
 * ʱ�˳�
 * ʹ��PW��ɰ���д���ı����ݲ���
 * Ҫ�� ������������Ӳ���
 * @author QAIU
 *
 */
public class Note {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���");
		String filename = scanner.nextLine();

		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(filename),"gbk")),true);

		System.out.println("������ÿһ���ı�����exit�˳�");

		String str;
		while(!"exit".equals(str = scanner.nextLine())) {
			pw.println(str);
		}
		pw.close();


		System.out.println("���˳�����ӭ�´�ʹ��");

	}
}
