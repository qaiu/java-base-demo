package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

//��������������ļ�����
public class Test5_Copy {
	public static void main(String[] args) throws Exception{
		
		//Դ�ļ�
		File from = new File("D:\\PC\\sx\\0.png");
		
		//Ŀ���ļ�
		File to = new File("./1.png");
		long t = System.currentTimeMillis();
		copy(from,to);
		t = System.currentTimeMillis() - t;

		System.out.println("д�����!��ʱ:"+t+"����");
	}
	
	private static void copy(File from,File to) throws Exception{
		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);
		
		BufferedInputStream bis = new BufferedInputStream(in);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		
		int b = 0;
		byte data[] = new byte[1024*8];
		while((b = bis.read(data)) != -1) {
			bos.write(data);
		}
		out.close();
	}
}
