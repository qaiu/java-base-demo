package day04;

import java.util.Scanner;

public class VipTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入积分：");
		int integral = scanner.nextInt();
		if (integral >= 5000) {
			System.out.println("会员卡类型为黑金");
		} else if (integral >= 2000) {
			System.out.println("会员卡类型为铂金");
		} else if (integral >= 1000) {
			System.out.println("会员卡类型为金卡");
		} else
			System.out.println("会员卡类型为银卡");
		scanner.close();
	}
}
