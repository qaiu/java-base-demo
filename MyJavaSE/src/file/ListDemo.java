package file;

import java.io.File;

/**
 * 获取一个目录的所有子项
 * @author QAIU
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		//获取当前目录中的所有子项

		//File dir = new File("./a");
		/*
		 * boolean isFile()
		 * boolean isDirctory()
		 * 判断File表示的是否是文件或目录
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
			System.out.println("删除目录"+file.getPath());
		}
	}
}