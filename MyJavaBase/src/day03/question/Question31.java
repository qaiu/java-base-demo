package day03.question;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		/*
		 * 2000�����ڴ�9�ۣ� 4000�����ڴ�8�� 8000�����ڴ�7.5�ۣ� 8000�����ϴ�7�ۣ�
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����빺���");
		double money = scanner.nextDouble();

		System.out.println("��������֣�");
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
		
		System.out.println("Ӧ�ɽ��Ϊ��" + money);
		scanner.close();

	}

}
