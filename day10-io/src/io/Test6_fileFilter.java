package io;

import java.io.File;

//�ļ������� fileFilter
public class Test6_fileFilter {
	public static void main(String[] args) {
		File file = new File("D:\\PC\\sx");
		File[] files = file.listFiles((f)->f.getName().endsWith(".jpg"));
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
	}
}
