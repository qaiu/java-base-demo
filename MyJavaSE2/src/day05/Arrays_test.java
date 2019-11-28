package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_test {
	public static void main(String[] args) {
//		method();
		method2();
	}
	
	//copyOf()数组复制
	public static void method2() {
		//创建一个原数组
		int[] a = {5,4,3,2,1};
		int[] b = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void method() {
		//创建无序数组
		int[] arr = {7,6,5,4,2,1};
		//对数组排序
		Arrays.sort(arr);
		//打印数组数据
		System.out.println(Arrays.toString(arr));
	}
}
