package day03.question;
import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		
		int num = scanner.nextInt();
		num=num>0?num:-num;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num/=10;
		}
		System.out.println("个位数之和为"+sum);
		
		scanner.close();
	}

}
