package day06;

import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[] nums= {6,7,4,4,1,6};
		int[] arr=Arrays.copyOf(nums, nums.length+3);
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
