package day03.question;

import java.util.Random;

public class Question74 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] count=new int[10];
		for (int i = 0; i < count.length; i++) {
			int t=ran.nextInt(10);
			count[t]++;
			System.out.println(t);
		}
		int temp=count[0];
		int max=0;
		int min=-1;
		System.out.println("统计次数：");
		for (int i = 0; i < count.length; i++) {
			if (temp<count[i]) {
				max=i;
				temp=count[i];
			}
			if (min==-1&&count[i]==1) {
				min=i;
			}
			System.out.println("数字"+i+"出现了"+count[i]+"次");
		}
		System.out.println("\n现次数最多的数字：");
		System.out.println(max);
		System.out.println("只出现一次的数字中最小的数字：");
		System.out.println(min);
		
	}
}