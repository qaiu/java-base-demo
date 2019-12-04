package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO ��׼�����������
 * java IO�Ա�׼���Ĳ��������ͬ���д���ݣ����ҽ�����д�������շ��򻮷�Ϊ��
 * ���룺����絽����ķ��������������ݵ�
 * ������ӳ������ķ���������д���ݵ�
 * 
 * 
 * java.io.InputStream,java.io.OutputStream
 * �����ǳ�����
 * �����ֽ����붼�̳���InputStream
 * �����ֽ�������̳���OutputStream
 * ���������ж�������Ӧ�ĳ��󷽷����涨��������������Ļ������ܵĶ�д�ֽڵķ�ʽ
 * 
 * java�����ֳ�������
 *     �ڵ������ֳƵͼ�������ʵ����������Դ�����ġ��ܵ�����
 *     ����ʵ�ʶ�д���ݵ���
 *     ��дһ���ǽ����ڽڵ����Ļ����Ͻ��е�
 * 
 * �����������ܶ������ڣ������������������ϣ�
 *     Ŀ���ǵ����ݡ���������ǰ��ʱ������мӹ�����
 *     �����Ƕ�дʱ�����ݵ���Ӧ����
 *    
 * �ļ���
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * ���õ�һ��ͼ�����ʵ���࣬���������ļ�
 * ���ļ����ж�д��������������RAFһ�£������и��Ե���ȱ�㣩
 * @author QAIU
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * �ļ��������ĳ��ù��췽��
		 * FileInputStream(File file)
		 * FileOutputStream(String path)
		 * 
		 * �������ֹ��췽���������ļ�������Ϊ����ģʽ
		 * �������ļ��������ļ����������Ȼ��ͨ����ǰ��
		 * д���������Ϊ�����ݱ���
		 * 
		 * FileOutputStream(File file,boolean append)
		 * FileOutputStream(String path,boolean append)
		 * �������ֹ��췽���������ļ�������Ϊ׷��ģʽ
		 * �������ļ����ڣ������ݱ�������ǰ��д������ݻ�
		 * ˳��׷�ӵ��ļ�ĩβ
		 */
		FileOutputStream fos = new FileOutputStream("./fos.txt",true);
		String line = "�ǵ�˫��������";
		byte[] data = line.getBytes("gbk");
		
		fos.write(data);
		System.out.println("д�����");
		
		fos.close();
	}
}
