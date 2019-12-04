package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ÿ�ζ�д��������������ʵ�ʶ�д�Ĵ���
 * �ǿ�����߶�дЧ�ʵ�
 * ���ֽڶ�д�������д
 * һ���ֽڶ�д�ǿ��д
 * @author QAIU
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		/*
		 * int read(byte[] data)
		 * һ���Զ�ȡ����
		 */
		RandomAccessFile src = new RandomAccessFile("C:\\Users\\QAIU\\Desktop\\javarun\\3DGameDemo.zip", "r");
		RandomAccessFile desc = new RandomAccessFile("C:\\Users\\QAIU\\Desktop\\javarun\\a.zip","rw");
		
		byte[] b = new byte[1024*10];
		int len = -1;
		long t = System.currentTimeMillis();
		while ((len = src.read(b)) != -1 ) {
			desc.write(b, 0, len);
		}
		t = System.currentTimeMillis() - t;
		System.out.println("������ϣ���ʱ��"+t+"����");
		src.close();
		desc.close();
	}
}
