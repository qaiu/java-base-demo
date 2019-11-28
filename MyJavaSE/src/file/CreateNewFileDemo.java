package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author QAIU
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前目录下创建新文件：test.txt
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * 判断File表示的文件或目录是否真实存在
		 */
		if (!file.exists()) {
			//如果文件不存在则创建该文件
			file.createNewFile();
			System.out.println("文件已创建");
		} else {

			System.out.println("文件已存在");
		}
	}
}
