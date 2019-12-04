package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO 标准的输入与输出
 * java IO以标准化的操作对外界同意读写数据，并且将读与写操作按照方向划分为：
 * 输入：从外界到程序的方向，是用来读数据的
 * 输出：从程序到外界的方向，是用来写数据的
 * 
 * 
 * java.io.InputStream,java.io.OutputStream
 * 他们是抽象类
 * 所有字节输入都继承自InputStream
 * 所有字节输出都继承自OutputStream
 * 这两个类中定义了相应的抽象方法，规定了所有输入输出的基本功能的读写字节的方式
 * 
 * java将流分成两大类
 *     节点流：又称低级流，是实际连接数据源与程序的“管道”，
 *     负责实际读写数据的流
 *     读写一定是建立在节点流的基础上进行的
 * 
 * 处理流：不能独立存在，必须连接在其他流上，
 *     目的是当数据“流经”当前流时对其进行加工处理
 *     简化我们读写时对数据的相应操作
 *    
 * 文件流
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * 常用的一类低级流的实现类，用来来接文件
 * 对文件进行读写操作（功能上与RAF一致，但都有各自的优缺点）
 * @author QAIU
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException{
		/*
		 * 文件输入流的常用构造方法
		 * FileInputStream(File file)
		 * FileOutputStream(String path)
		 * 
		 * 上面两种构造方法创建的文件输入流为覆盖模式
		 * 即：若文件存在则文件数据清除，然后通过当前流
		 * 写入的数据作为新数据保存
		 * 
		 * FileOutputStream(File file,boolean append)
		 * FileOutputStream(String path,boolean append)
		 * 以上两种构造方法创建的文件输入流为追加模式
		 * 即：若文件存在，则数据保留，当前流写入的内容会
		 * 顺序追加到文件末尾
		 */
		FileOutputStream fos = new FileOutputStream("./fos.txt",true);
		String line = "记得双击嬷嬷哒";
		byte[] data = line.getBytes("gbk");
		
		fos.write(data);
		System.out.println("写入完毕");
		
		fos.close();
	}
}
