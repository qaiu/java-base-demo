package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用对象流完成对象的反序列化
 * @author QAIU
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		System.out.println(object);
		ois.close();
	}
}
