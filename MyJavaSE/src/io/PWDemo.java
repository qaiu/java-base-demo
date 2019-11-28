package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * �����������ǻ����ַ������������
 * ��һ�Ը߼������ڲ��л�������д
 * �ı�����Ч�ʸ�
 * 
 * java.io.PrintWriter
 * �ڲ���������BufferedWriter��Ϊ�������ʹ��
 * ����PW��֧���Զ�ˢ�¹��ܣ�ʵ�ʿ����Ƚϳ���
 * @author QAIU
 *
 */
public class PWDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter�ṩ�˶��ļ�ֱ��д�����Ĺ�����
		 * PrintWriter(File file)
		 * PrintWriter(String path)
		 * ��������Ĺ�������֧��һ�����أ��ڶ�������
		 * ���ַ������ƣ��������԰���ָ�����ַ�������д���ı�����
		 */
		PrintWriter pw = new PrintWriter("pw.txt","GBK");
		pw.println("д�뻻��");
		pw.print("������");
		pw.println("������");
		pw.close();
	}
}
