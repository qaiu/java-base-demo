package day15;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("������һ������");

		String s = new Scanner(System.in).nextLine();

		//Class<?> �����
		Class<?> c = Class.forName(s);
		
		System.out.println("\n----ִ���޲ι���-------------------------------");
		f1(c);
		System.out.println("\n----ִ���вι���-------------------------------");
		f2(c);
	}


	private static void f1(Class<?> c) {
		try {
			//�����½�ʾ��,ͬʱִ���޲ι���
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("����ִ���޲ι���");
		}
	}
	
	private static void f2(Class<?> c) {
		try {
			//��ȡint�������췽��
			Constructor<?> t = c.getDeclaredConstructor(int.class);
			//�����½�ʵ��,ͬʱִ��������췽��
			Object obj = t.newInstance(100);
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("����ִ��int��������");
		}
	}
}
