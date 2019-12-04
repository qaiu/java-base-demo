package file;

import java.io.File;

/**
 * java.io.File
 * File用来表示文件系统中的一个文件或目录
 * 使用File我们可以：
 * 1：访问其表示的文件或目录的属性（名称，大小等）
 * 2：操作文件或目录（创建，删除）
 * 3：访问目录子项
 * 
 * 但是不能访问文件数据
 * @author QAIU
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * 创建File时指定路径通常用相随路径
		 * 绝对路径优点是清晰明了，但是不能变通
		 * 不适用于跨平台
		 * 相对路径相对模糊，具体是哪里要视运行环境而定
		 * 但是适应性更强，跨平台好
		 * 
		 * 相对路径中"."表示当前目录，在Eclipse中
		 * 运行时，"."对应的目录是当前程序所在的项目目录
		 */
		File file = new File("./demo.txt");//打开文件
		
		System.out.println(File.pathSeparator);//路径分隔符
		System.out.println(file.getName());//获取文件名
		System.out.println(file.length());//获取文件大小（长度）
		//可读 可写 可运行 是否隐藏
		System.out.println("可读："+file.canRead());
		System.out.println("可写："+file.canWrite());
		System.out.println("可运行："+file.canExecute());
		System.out.println("隐藏："+file.isHidden());
		
	}
}
