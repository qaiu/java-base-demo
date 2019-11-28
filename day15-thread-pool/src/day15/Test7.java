package day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("������һ������");
		
		String s = new Scanner(System.in).nextLine();
		
		//Class<?> �����
		Class<?> c = Class.forName(s);
		System.out.println("----��������-------------");
		f1(c);
		System.out.println("----��Ա����-------------");
		f2(c);
		System.out.println("----���췽��-------------");
		f3(c);
		System.out.println("----������-------------");
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
		
//		Field[] a = c.getDeclaredFields(); //��ȡȫ����Ա����
		Field[] a = c.getFields(); //��ȡ˽�г�Ա����
		
		for (Field f : a) {
			String t = f.getType().getSimpleName();//����
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
		 * Method��װ��һ����������Ϣ
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
