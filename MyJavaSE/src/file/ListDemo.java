package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼����������
 * @author QAIU
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		//��ȡ��ǰĿ¼�е���������

		//File dir = new File("./a");
		/*
		 * boolean isFile()
		 * boolean isDirctory()
		 * �ж�File��ʾ���Ƿ����ļ���Ŀ¼
		 */
		/*
		if (dir.isDirectory()) {
			File[] subs = dir.listFiles();
			System.out.println(subs.length);
			for (File file : subs) {
				System.out.println(file.getName());
			}
		}*/
		new File("").list();
		new ListDemo().deleteAll(new File("./doc2"));
	}

	void deleteAll(File file) {
		if (!file.exists()) {
			return;
		}

		if(file.isFile()||file.list() == null) {
			file.delete(); 
			System.out.println("delete:"+file.getPath());
		}else {
			File[] list = file.listFiles();
			for (File f : list) {
				deleteAll(f);
			}
			file.delete();
			System.out.println("ɾ��Ŀ¼"+file.getPath());
		}
	}
}