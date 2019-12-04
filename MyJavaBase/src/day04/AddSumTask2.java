package day04;

public class AddSumTask2 {
	
	public static void main(String[] args) {
		
		int i = 1;
		int num=4000;
		int sum=0;
		while (i<=12) {
			sum += num;
			num += 200;
			i++;
		}
		System.out.println(sum);
	}
}
