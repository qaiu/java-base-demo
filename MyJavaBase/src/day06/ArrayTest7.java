package day06;

import java.util.Arrays;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] nums = {5,3,4,1,3};
		
		// 1. ���鸴��
		int arr[]=new int[nums.length];
		System.arraycopy(nums, 2, arr, 1, 3); // ԭ���飬ԭ������ʼλ�ã�Ŀ�����飬Ŀ��������ʼλ�ã����Ƹ���
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n-------------");
		int[] arr2=Arrays.copyOf(nums, 7);  // ԭ���飬ԭ������ʼλ�ã���������������
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println("\n-------------");
		
		// 2. ��������
		Arrays.sort(arr2); // Ҫ���������
		for (int i : arr2) {
			System.out.print(i+" ");
		}

	}

}
