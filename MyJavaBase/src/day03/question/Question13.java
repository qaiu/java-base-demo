package day03.question;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		int num = scanner.nextInt();
		
		if (num>9999||num<1000) {
			System.out.println("该数字不是四位数");
		}
		else {
			int sum = num/1000+num%1000/100+num%100/10+num%10;
			System.out.println("各位数字之和为："+sum);
		}
		scanner.close();
	}

}
