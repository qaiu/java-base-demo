package day04;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入今天周几：");
		int date=scanner.nextInt();
		switch (date) {
		case 1:
			System.out.println("今天的特价菜是黄焖鸡");
			break;
		case 2:
			System.out.println("今天的特价菜是烤鸭");
			break;
		case 3:
			System.out.println("今天的特价菜是酸菜鱼");
			break;
		case 4:
			System.out.println("今天的特价菜是西红柿牛腩");
			break;
		case 5:
			System.out.println("今天的特价菜是孜然羊肉");
			break;

		default:
			System.out.println("今天没有特价菜");
			break;
		}
		scanner.close();
	}

}
