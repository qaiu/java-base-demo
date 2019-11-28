package io;

import java.io.File;
import java.util.Arrays;

public class Test2_List {
	public static void main(String[] args) {
		
		long size = dirSize(new File("D:\\PC\\sx"));
		System.out.println(size/1024/1024+"MB"+" ("+size+"×Ö½Ú)");
	}
	
	final static int BLOCK = 1024*128;
	static long dirSize(File file) {
		if (file == null) {
			return 0;
		}
		if (file.isFile()) {
			return 0;
		}
		File files[] = file.listFiles();
		long sumLength = 0;
		for (File file2 : files) {
			if (file2.isFile()) {
				long len = file2.length();
				len = len % BLOCK == 0 ? len : (len / BLOCK + 1) * BLOCK;
				sumLength += len;
			} else {
				sumLength += dirSize(file2);
			}
		}
		return sumLength;
	}
}
