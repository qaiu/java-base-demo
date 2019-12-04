package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scan {
	public static void main(String[] args) throws Exception {
		// 数据源
		InputStream in = System.in;
		// 因为BufferedWriter不能直接接受InputStream作为参数类型，所以需要转换字符流
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		// 关闭流
		br.close();
	}
}
