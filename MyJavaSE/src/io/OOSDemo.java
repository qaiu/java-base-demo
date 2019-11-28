package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 对象流是一对高级流，作用是将java对象与字节
 * 进行相互转换，便于我们读写java对象
 * @author QAIU
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String[] outerInfo = {"是个演员","来自岛国","爱好写毛笔字","促进中日文化交流"};
		
		Person p = new Person(name, age, gender, outerInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * 对象输出流提供的方法：
		 * void writeObject(Object obj)
		 * 将对象按照其结构转换一组字节并写出
		 * 
		 * 写出对象所属的类必须实现Serializable接口
		 * 否则写出时会抛出异常
		 * 一个对象转出字节后会发现比该对象实际存储的数据要大
		 * 这是因为这组字节除了包含当前对象的数据外 还要记录对象的
		 * 结构信息以便于还原
		 * 
		 * 这里涉及到两个专业术语
		 * 1.将一个对象经过对象流写出时
		 * 对象流会按照其结构将该对象转换成一组字节
		 * 这个过程叫做对象序列化
		 * 
		 * 2.这组被序列化后的字节在经过文件流写入文件（写入磁盘）
		 * 做长久保存的过程
		 * 叫做数据持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕");
		oos.close();
		
	}
}
