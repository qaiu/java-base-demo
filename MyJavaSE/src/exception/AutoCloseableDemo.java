package exception;

import java.io.FileOutputStream;

/**
 * jdk7新特性:自动关闭
 * 
 * @author QAIU
 *
 */
public class AutoCloseableDemo {
	public static void main(String[] args) {
		/*
		 * 只有实现了Autocloseable接口的类才能在这里定义
		 * 流和FileOutputStream都实现了这个接口
		 * 编译器会在编译时将这里定义的内容最终在finally中调用
		 * close方法关闭
		 */
		try (FileOutputStream fos = new FileOutputStream("fos.dat");) {
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
