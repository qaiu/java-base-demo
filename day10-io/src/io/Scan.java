package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scan {
	public static void main(String[] args) throws Exception {
		// ����Դ
		InputStream in = System.in;
		// ��ΪBufferedWriter����ֱ�ӽ���InputStream��Ϊ�������ͣ�������Ҫת���ַ���
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		// �ر���
		br.close();
	}
}
