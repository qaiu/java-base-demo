package day03.question;

import java.util.Random;

public class Question73 {
	public static void main(String[] args) {
		Random ran = new Random();

		int[] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(10)+1;
			for (int j = 0; j < i; j++) {
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}
}