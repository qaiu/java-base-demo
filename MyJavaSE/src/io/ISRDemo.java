package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader
 * 转换流--输入
 * 
 * InputStreamReader与OutputStreamWriter之所以
 * 称为转换流是因为:
 * 通常java中其他的高级字符流都只能连接在其他字符
 * 流上,都不能直接连接字节流.但是它们是可以连接在
 * 字节流上的,而本身又是字符流,这样就可以让其他的
 * 字符流与字节流衔接了,起到了"转换器"的作用.
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