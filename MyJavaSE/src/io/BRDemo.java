package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * 特点：块读写效率高，并且可以按行读取字符串
 * @author QAIU
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
		//download.eclipse.org/recommenders/updates/stable/
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		/*
		 * String readline()
		 * 返回一行字符串，缓冲流会将一行字符串
		 * (到换行符"\n"为止，但不包括"\n")的内容
		 * 返回，若返回值为null，则表示流已经读取到了末尾
		 */
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
