package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * �ص㣺���дЧ�ʸߣ����ҿ��԰��ж�ȡ�ַ���
 * @author QAIU
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
		//download.eclipse.org/recommenders/updates/stable/
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		/*
		 * String readline()
		 * ����һ���ַ������������Ὣһ���ַ���
		 * (�����з�"\n"Ϊֹ����������"\n")������
		 * ���أ�������ֵΪnull�����ʾ���Ѿ���ȡ����ĩβ
		 */
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
