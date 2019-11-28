package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�ListFiles
 * File[] ListFiles(FileFilter filter)
 * �÷��� ���ڻ�ȡFile����ʾ��Ŀ¼�з��ϸ���������Ҫ�������
 * �����ϵ������
 * @author QAIU
 *
 */
public class ListFileDemo2 {
	public static void main(String[] args) {
		File dir = new File(".");
	
		if (dir.isDirectory()) {
			/*
			 * �ļ��������ʺ�ʹ�������ڲ�����ʽʵ��
			 */
//			FileFilter fileFilter = new FileFilter() {
//				
//				@Override
//				public boolean accept(File file) {
//					System.out.println("���ڹ���"+file.getName());
//					return file.getName().startsWith(".");
//				}
//			};
			/*
			 * ListFiles�����ὫĿ¼����������
			 * ˳�򾭹����Ķ���������accept��������������ֵ
			 * Ϊtrue�������������
			 */
			File[] subs = dir.listFiles((f)->f.getName().startsWith("."));
			System.out.println(subs.length);
			for (File file : subs) {
				System.out.println(file.getName());
			}
		}
	}
}
