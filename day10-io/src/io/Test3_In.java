package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test3_In {
	public static void main(String[] args) throws Exception {
		method();
	}
	
	//字节流读取
	private static void method() throws Exception{
		
		//1.创建字节流对象
		InputStream in = new FileInputStream("./1.txt");
		
		int d = 0;
		StringBuffer sb = new StringBuffer();
		while ((d = in.read()) != -1) {//-1,表示已经文件末尾
//			System.out.print((char)d);
			sb.append(d);
		}
		System.out.println(sb);
//		//2.开始读
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.read());//-1,表示已经读到了文件末尾
		
		//3.关闭资源
		in.close();
	}

}
