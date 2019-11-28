package day03;

import java.util.Arrays;

public class Tt {
	public void m(int[] a) {
		int i,j,t;
		for (i = 1; i < a.length; i++) {
			t=a[i];
			j=i-1;
			while (j>=0&&t<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
	}
	public static void main(String[] args) {
		Tt tt=new Tt();
		byte b1=1,b2=2,b;
		int[][]a1=new int[1][];
		int[] a= {1,9,7,88,8};
		tt.m(a);
		
		System.out.println(Arrays.toString(a));
	}
}
