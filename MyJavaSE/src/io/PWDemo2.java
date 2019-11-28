package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PW
 * 
 * @author QAIU
 *
 */
public class PWDemo2 {
	public static void main(String[] argv) throws IOException {
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println(123*3);
		
		pw.close();
		
		
	}
}
