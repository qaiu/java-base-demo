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
		System.out.println("ͳ�ƴ�����");
		for (int i = 0; i < count.length; i++) {
			if (temp<count[i]) {
				max=i;
				temp=count[i];
			}
			if (min==-1&&count[i]==1) {
				min=i;
			}
			System.out.println("����"+i+"������"+count[i]+"��");
		}
		System.out.println("\n�ִ����������֣�");
		System.out.println(max);
		System.out.println("ֻ����һ�ε���������С�����֣�");
		System.out.println(min);
		
	}
}