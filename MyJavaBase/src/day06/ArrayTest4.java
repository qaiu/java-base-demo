package day06;

public class ArrayTest4 {

	public static void main(String[] args) {
		double array[]= {15.6,17.2,3.7,6.8,1.2,10.9};
		
		double min=array[0];
		for (int i=1;i<array.length;i++) {
			if (min>array[i]) {
				min=array[i];
			}
		}
		System.out.println(min);
	}

}
