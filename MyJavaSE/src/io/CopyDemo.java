package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ����Ʋ���
 * @author QAIU
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 1.�����ļ���������ȡԴ�ļ�
		 * 2.�����ļ������д�����ļ�
		 * 3.ѭ����д����ɸ���
		 */
		
		FileInputStream fis = new FileInputStream("\\jdk api 1.8_China");
		FileOutputStream fos = new FileOutputStream("out.exe");
		
		byte[] data = new byte[1024*8];
		int len = -1;
		while((len = fis.read(data))!=-1) {
			fos.write(data, 0, len);
		}
		System.out.println("�������");
	}
}
