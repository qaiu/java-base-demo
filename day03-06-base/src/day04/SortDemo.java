package day04;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {
	public static void main(String[] args) {
		int length = 80000;
		Random ran = new Random();
		int[] arr = new int[length];
		int[] arr2 = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100);
			arr2[i] = ran.nextInt(100); 
		}
		long one = System.currentTimeMillis();
//		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		long two = System.currentTimeMillis();
		sort1(arr2);
		long three = System.currentTimeMillis();
		System.out.println("����������ʱ(��λ����)��" + (two - one));
		System.out.println("ð��������ʱ(��λ����)��" + (three - two));
//		System.out.println(Arrays.toString(arr2));
	}

	//ð������1:�ѽϴ����������
	public static void sort1(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i-1; j++) {
//				k++;
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
//		System.out.println("k="+k);
	}

	//ð������2���ѽ�С������ǰ��
	public static void sort2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	/**
	 * �������� ʹ�ý����ķ�ʽ
	 * arr: 5 3 1 2 4
	 * 	   ^  ^
	 *   1��3 5 1 2 4
	 *     ^    ^
	 *   2��3 1 5 2 4
	 *   	1 3 5 2 4
	 *       ^    ^
	 *   3��1 3 2 5 4
	 *   	1 2 3 5 4
	 *   		 ^  ^
	 *   4��1 2 3 4 5
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int t = i+1;
			for (int j = i + 1; j > 0; j--) {
//				k++;
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
//		System.out.println("k="+k);
	}
	/*
	 * ��������
	 */
	public static void insertSort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
	}
}
