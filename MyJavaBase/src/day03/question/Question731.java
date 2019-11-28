package day03.question;

import java.util.Random;

public class Question731 {
	public static void main(String[] args) {
		Random ran = new Random();

		int[] arr=new int[5];
		int[] temp=new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i;
		}
		for (int i = 0; i < temp.length; i++) {
			int r=ran.nextInt(10);
			if (r!=i) {
				temp[i]=temp[i]^temp[r];
				temp[r]=temp[i]^temp[r];
				temp[i]=temp[i]^temp[r];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=temp[i];
		}
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("\n现次数最多的数字：");

	}
}