package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author QAIU
 *
 */
public class MkdirsDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建：a/b/c/d/e/f目录
		 */
		File dirs = new File("./a/b/c/d/e/f");
		if (!dirs.exists()) {
			/*
			 * mkdirs会将所有不存在的父目录一同创建出来
			 * 而mkdir不会，如果父目录不存在则创建失败
			 * 因此以后推荐使用mkdirs创建目录
			 */
			dirs.mkdirs();
			System.out.println("目录已创建！");
		} else {
			System.out.println("目录不存在！");
		}
	}
}
