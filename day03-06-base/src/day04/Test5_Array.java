package day04;

import java.util.Arrays;
import java.util.Random;

public class Test5_Array {
	public static void main(String[] args) {
//		method();
//		method2();
//		short a=9;
//		name(12);
		method3();
		byte b = 0;
		sum(b, b);// now ambiguity
	}
	
	//创建数组存入随机值
	public static void method3() {
		int[] a = new int[5];
		Random ran = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(5)+1;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//遍历数组，存入1到10
	
	public static void method2() {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//存入月份
	public static void method() {
		int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < day.length; i++) {
			System.out.println(i+1+"月有"+day[i]+"天");
		}
	}
	
	public static void name(short a) {
		System.out.println("1");
	}
	
	public static void name(int a) {
		System.out.println("2");
	}
	static void sum(int a, long b) {
        System.out.println("a method invoked");
    }

//    static void sum(long a, int b) {
//        System.out.println("b method invoked");
//    }

}
