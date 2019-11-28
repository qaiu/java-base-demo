package file;

import java.io.File;

/**
 * 创建一个空目录
 * @author QAIU
 *
 */
public class MkdirDemo {
	public static void main(String[] args) {
		// 在当前目录下创建空目录Demo
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("目录已创建");
		} else {
			System.out.println("目录已存在");
		}
	}
}
