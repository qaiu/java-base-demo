package day18;

import java.io.File;
import java.net.URLDecoder;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//获取Bin的完整路径
		String path = Test1.class.getResource("/").getPath();
		
		path = URLDecoder.decode(path,"utf-8");
		System.out.println(path);
		
		File dir = new File(path);//扫描路径得到class文件
		scan(dir);
	}

	private static void scan(File dir) {
		//对文件夹列表
		File[] files = dir.listFiles();
		//路径不存在,或者文件夹没有权限进入,会得到null值
		if (files == null) {
			return;
		}
		//对所有子文件或子目录进行遍历
		for (File f : files) {
			if (f.isFile()) { //f是文件
				System.out.println(f.getAbsolutePath());
			} else {//如果是文件夹
				scan(f);
			}
		}
	}
}
