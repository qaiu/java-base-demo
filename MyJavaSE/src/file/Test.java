package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 编写程序，获取当前项目目录下src/string目录下
 * 所有名字以"S"开头的文件并将这些文件的名字输出到控制台
 * @author QAIU
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./src/Stringdemo");
		if (dir.isDirectory()) {
			FileFilter fileFilter = new FileFilter() {
				public boolean accept(File pathname) {
					return pathname.getName().startsWith("S");
				}
			};
			File[] subs = dir.listFiles(fileFilter);
			System.out.println(subs.length);
			for (File file : subs) {
				System.out.println(file.getName());
			}	
		}
	}
}
