package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 * �����ֽ���������� ��һ�Ը߼�����
 * �������ӵ���������߶�дЧ��
 * ���ڲ�ά����һ��8K���ֽ����飬
 * ������д������ת���ɿ��д�Ӷ����Ч�ʣ�
 * @author QAIU
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\jdk api 1.8_China\\ʹ��˵��.docx");
		FileOutputStream fos = new FileOutputStream("ʹ��˵��1.docx");
		
		BufferedInputStream bif = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data = -1;
		while((data = bif.read())!=-1) {
			bos.write(data);
		}
		System.out.println("������ϣ�");
		bif.close();
		bos.close();
	}
}
