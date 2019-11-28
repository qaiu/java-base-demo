package oopday03;

public class DoubleArray {
	
	public static void main(String[] args) {
		int[][] nums= {
			{1,2,3,4},
			{2,3,3},
			{8,9,7,6},
			{6,6,8,87,7,7,7,0}
		};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
