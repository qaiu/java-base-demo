package day15;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("请输入一个类名");

		String s = new Scanner(System.in).nextLine();

		//Class<?> 类对象
		Class<?> c = Class.forName(s);
		
		System.out.println("\n----执行无参构造-------------------------------");
		f1(c);
		System.out.println("\n----执行有参构造-------------------------------");
		f2(c);
	}


	private static void f1(Class<?> c) {
		try {
			//反射新建示例,同时执行无参构造
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("不能执行无参构造");
		}
	}
	
	private static void f2(Class<?> c) {
		try {
			//获取int参数构造方法
			Constructor<?> t = c.getDeclaredConstructor(int.class);
			//反射新建实例,同时执行这个构造方法
			Object obj = t.newInstance(100);
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("不能执行int参数构造");
		}
	}
}
