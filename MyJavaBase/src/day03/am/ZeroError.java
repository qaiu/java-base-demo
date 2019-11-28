package day03.am;

import java.util.jar.Attributes.Name;

public class ZeroError {
	public static void myFun(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		int[] arr= new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		for (int i : arr) {
			System.out.println("each"+i);
		}
		myFun("999");
		//myFun("666");
		//System.out.println(1!=1);
	}
}
