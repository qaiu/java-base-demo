package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java�����ն�д��λ��Ϊ���ֽ������ַ���
 * �ֽ��������ֽ�Ϊ��λ��һ�����ٶ�д8λ������
 * �ַ��������ַ�Ϊ��λ��д���ݣ���ʵ�ʶ�д���ֽ�����
 * ָ�����ַ������д���ַ������й�
 * ������java�ڲ���ʾ�ַ�����ʱ������char��ʾ��2�ֽڣ�
 * 
 * java.io.Writer,java.io.Reader
 * �����������ǳ����࣬�������ַ���������ַ��������ĳ���
 * ����涨�˶�д�ַ���صķ���
 * 
 * �ַ�ת�������������ַ�����һ�Գ���ʵ���࣬��һ�Ը߼���
 * ʵ�ʿ����������ڶ�д�ı�����ʱ������������������Ҫ��һ��
 * �������ǲ���ֱ�Ӳ��������
 * 
 * @author QAIU
 *
 */

public class OSWDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
		/*
		 * ת�����ڴ���ʱͨ��ָ���ڶ���������ȷ
		 * ���ַ���������ͨ����ǰ��д���ı�ʱ
		 * ���ᰴ�ո��ַ���ת��Ϊ�ֽں�����д��
		 */
		String string = "���ֵܾ�������~~~~~~";
		osw.write(string);
		
		osw.close();
		System.out.println("������");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
