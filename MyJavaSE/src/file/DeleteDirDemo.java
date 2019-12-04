package file;

import java.io.File;

/**
 * 删除目录
 * @author QAIU
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		// 将当前目录下的demo目录删除
		File dir =  new File("./a");
		if (dir.exists()) {
			/*
			 * 使用delete删除目录时 必须是空目录 否则删除失败
			 */
			dir.delete();
			System.out.println("目录已删除");
		} else {
			System.out.println("目录不存在");
		}
		
	}
}
