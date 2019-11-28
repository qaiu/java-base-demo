package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的ListFiles
 * File[] ListFiles(FileFilter filter)
 * 该方法 用于获取File所表示的目录中符合给定过滤器要求的子项
 * 不符合的则忽略
 * @author QAIU
 *
 */
public class ListFileDemo2 {
	public static void main(String[] args) {
		File dir = new File(".");
	
		if (dir.isDirectory()) {
			/*
			 * 文件过滤器适合使用匿名内部类形式实现
			 */
//			FileFilter fileFilter = new FileFilter() {
//				
//				@Override
//				public boolean accept(File file) {
//					System.out.println("正在过滤"+file.getName());
//					return file.getName().startsWith(".");
//				}
//			};
			/*
			 * ListFiles方法会将目录中所有子项
			 * 顺序经过给的定过滤器的accept方法，并将返回值
			 * 为true的子项保留并返回
			 */
			File[] subs = dir.listFiles((f)->f.getName().startsWith("."));
			System.out.println(subs.length);
			for (File file : subs) {
				System.out.println(file.getName());
			}
		}
	}
}
