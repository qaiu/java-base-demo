package day03.question;

import java.util.Random;

public class Question72 {
	public static void main(String[] args) {
		Random ran = new Random();

		int[] arr=new int[10];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(10);
			sum+=arr[i];
		}
		System.out.println("����ǰ��");
		for (int i : arr) {
			System.out.println(i);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("�����");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("�ܺͣ�"+sum);
		System.out.println("ƽ��ֵ��"+(double)sum/arr.length);

	}
}