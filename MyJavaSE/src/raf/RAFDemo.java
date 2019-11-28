package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF��ר�Ŵ����д�ļ����ݵ�API�������ָ��
 * ���ļ���������λ�ý��ж�д.
 * @author QAIU
 *
 */

public class RAFDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * ����RAF���������õĹ��췽��
		 * RandomAccessFile(File f, String mode);
		 * RandomAccessFile(String path, String mode);
		 * �ڶ�������Ϊ����ģʽ���У�
		 * "r"��ֻ��ģʽ�������ļ���������
		 * "rw"����дģʽ�����ļ����ݿɶ���д
		 */
		RandomAccessFile raf = new RandomAccessFile("./rad.dat", "rw");
		raf.write(-2);
		//raf.writeUTF("123oooooooooooo");
		raf.close();
		
	}
}
