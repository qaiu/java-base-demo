package day03.question;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		/*
		 * 2000分以内打9折， 4000分以内打8折 8000分以内打7.5折， 8000分以上打7折，
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入购物金额：");
		double money = scanner.nextDouble();

		System.out.println("请输入积分：");
		int integral = scanner.nextInt();
		
		if (integral<2000) {
			money*=.9;
		}
		else if (integral<4000) {
			money*=.8;
		}
		else if (integral<8000) {
			money*=.75;
		}
		else {
			money*=.7;
		}
		
		System.out.println("应缴金额为：" + money);
		scanner.close();

	}

}
