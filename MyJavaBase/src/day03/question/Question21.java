package day03.question;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double money = scanner.nextDouble();
		
		if (money*.8>=1000) {
			System.out.println("恭喜您获得200元优惠券1张");
		}

		scanner.close();
	}

}
