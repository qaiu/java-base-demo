package day06;
;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[] nums= {7,6,3,9,8,4,1,2};
		int[] arr=new int[nums.length];
		System.arraycopy(nums, 3, arr, 2, 3);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
