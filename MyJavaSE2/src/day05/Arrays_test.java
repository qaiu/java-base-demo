package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_test {
	public static void main(String[] args) {
//		method();
		method2();
	}
	
	//copyOf()���鸴��
	public static void method2() {
		//����һ��ԭ����
		int[] a = {5,4,3,2,1};
		int[] b = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void method() {
		//������������
		int[] arr = {7,6,5,4,2,1};
		//����������
		Arrays.sort(arr);
		//��ӡ��������
		System.out.println(Arrays.toString(arr));
	}
}
