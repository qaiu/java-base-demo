package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * �ļ������������ڶ�ȡ�ļ�����
 * 
 * �ļ�����RAF��������
 * 1��RAF�ǻ���ָ��������д����д��ʽ�����
 * ���ҿ��Զ��ļ��������ݸ��ǽ��б༭����
 * ���ļ������У��ļ����ǻ���java��׼IO
 * �Ĳ�����ʽ����IO��дΪ˳���д��
 * ��ֻ������д�������ܻ���
 * 
 * 2���ļ������Խ�����������ɸ���
 * ��д��������һ����RAF��������
 * @author QAIU
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fis.read(data);
		System.out.println("ʵ�ʶ�ȡ���ˣ�"+len+"�ֽ�");
		/*
		 * String(byte[] data,int offset,int len,string csn)
		 * ���������ַ�������
		 * �������ַ�������±�offset
		 * ��������len���ֽڰ���ָ�����ַ���תΪ�ַ���
		 */
		String line = new String(data,0,len,"gbk");
		System.out.println(line);
	}
}
