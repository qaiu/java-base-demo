package day06;

import java.util.Arrays;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] nums = {5,3,4,1,3};
		
		// 1. 数组复制
		int arr[]=new int[nums.length];
		System.arraycopy(nums, 2, arr, 1, 3); // 原数组，原数组起始位置，目标数组，目标数组起始位置，复制个数
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n-------------");
		int[] arr2=Arrays.copyOf(nums, 7);  // 原数组，原数组起始位置，返回新数组引用
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println("\n-------------");
		
		// 2. 数组排序
		Arrays.sort(arr2); // 要排序的数组
		for (int i : arr2) {
			System.out.print(i+" ");
		}

	}

}
