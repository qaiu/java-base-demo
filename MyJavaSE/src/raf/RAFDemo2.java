package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("./rad.dat", "r");
		/*
		 * int read()
		 * ��ȡ1�ֽ� ��int���� ֻ��ȡ�Ͱ�λ������ ������0
		 * �������-1 ��ʾ��ȡ�����ļ�ĩβ
		 * ��							��
		 * 00000000 00000000 00000001 00000000
		 * 
		 * 00000000 00000000 00000000 00000000 
		 */
		int d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
