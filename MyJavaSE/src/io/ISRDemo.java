package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * ת����--����
 * 
 * InputStreamReader��OutputStreamWriter֮����
 * ��Ϊת��������Ϊ:
 * ͨ��java�������ĸ߼��ַ�����ֻ�������������ַ�
 * ����,������ֱ�������ֽ���.���������ǿ���������
 * �ֽ����ϵ�,�����������ַ���,�����Ϳ�����������
 * �ַ������ֽ����ν���,����"ת����"������.
 * 
 * 
 * @author Administrator
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/io/ISRDemo.java");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		int d = -1;
		while((d = isr.read())!=-1) {
			System.out.print((char)d);
		}
		isr.close();
	}
}