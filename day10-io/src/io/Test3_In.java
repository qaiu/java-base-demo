package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test3_In {
	public static void main(String[] args) throws Exception {
		method();
	}
	
	//�ֽ�����ȡ
	private static void method() throws Exception{
		
		//1.�����ֽ�������
		InputStream in = new FileInputStream("./1.txt");
		
		int d = 0;
		StringBuffer sb = new StringBuffer();
		while ((d = in.read()) != -1) {//-1,��ʾ�Ѿ��ļ�ĩβ
//			System.out.print((char)d);
			sb.append(d);
		}
		System.out.println(sb);
//		//2.��ʼ��
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());//-1,��ʾ�Ѿ��������ļ�ĩβ
		
		//3.�ر���Դ
		in.close();
	}

}
