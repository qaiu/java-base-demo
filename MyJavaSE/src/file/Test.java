package file;

import java.io.File;
import java.io.FileFilter;

/**
 * ��д���򣬻�ȡ��ǰ��ĿĿ¼��src/stringĿ¼��
 * ����������"S"��ͷ���ļ�������Щ�ļ����������������̨
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
