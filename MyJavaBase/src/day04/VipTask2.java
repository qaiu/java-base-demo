package day04;

import java.util.Scanner;

public class VipTask2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���������ѽ�");
		double money = scanner.nextDouble();
		if (money > 500) {
			money*=.8;
		} else if (money > 100) {
			money*=.9;
		} else if (money > 50) {
			money*=.95;
		} 
		System.out.println("ʵ�����ѽ��Ϊ"+money);
		scanner.close();
	}
}
