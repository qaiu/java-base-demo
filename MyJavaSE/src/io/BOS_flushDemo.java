package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author QAIU
 *
 */
public class BOS_flushDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "ooooooooooook~";
		bos.write(str.getBytes("GBK"));
		/*
		 * void flush()
		 * �÷�����OutputStream����ķ�����
		 * �����������ֽ��������ʵ���˸÷����Ĺ���
		 * ֻ�л������ĸ÷�����ʵ������
		 * ������һ���Խ��������Ѵ��ڵ�����д��
		 * ֮�������е��ֽ������и÷�������Ϊ
		 * ������Ӧ���л�����ͨ������"�ն���"��ֱ�ӱ����ǲ���������
		 * Ϊ�˴���ˢ�»��������ܲ���
		 */
		bos.flush();
		System.out.println("д�����");
		bos.close();
		
	}
}
