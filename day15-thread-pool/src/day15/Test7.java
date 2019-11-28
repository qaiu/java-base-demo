package day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("请输入一个类名");
		
		String s = new Scanner(System.in).nextLine();
		
		//Class<?> 类对象
		Class<?> c = Class.forName(s);
		System.out.println("----包名类名-------------");
		f1(c);
		System.out.println("----成员变量-------------");
		f2(c);
		System.out.println("----构造方法-------------");
		f3(c);
		System.out.println("----方法名-------------");
		f4(c);
	}
	

	private static void f1(Class<?> c) {
		String p = c.getPackage().getName();
		String n = c.getName();
		String sn = c.getSimpleName();
		System.out.println(p);
		System.out.println(n);
		System.out.println(sn);
		
		
	}

	private static void f2(Class<?> c) {
		
//		Field[] a = c.getDeclaredFields(); //获取全部成员变量
		Field[] a = c.getFields(); //获取私有成员变量
		
		for (Field f : a) {
			String t = f.getType().getSimpleName();//类型
			String n = f.getName();
			System.out.println(t + " " + n);
		}
	}

	private static void f3(Class<?> c) {
		Constructor<?>[] a = c.getDeclaredConstructors();
		for (Constructor<?> t : a) {
			String n = c.getSimpleName();
			Class<?>[] p = t.getParameterTypes();
			System.out.println(n+"("+Arrays.toString(p)+")");
		}
	}
	
	private static void f4(Class<?> c) {
		/*
		 * Method封装了一个方法的信息
		 * public static final String f(int,String) throws x,y,z
		 * 
		 */
		
		Method[] a = c.getDeclaredMethods();
		for (Method t : a) {
			String r = t.getReturnType().getSimpleName();
			String n = t.getName();
			Class<?>[] p = t.getParameterTypes();
			System.out.println(r+" "+ n + "("+ Arrays.toString(p) + ")");
		}
	}
}
