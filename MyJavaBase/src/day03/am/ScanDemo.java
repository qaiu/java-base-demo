package day03.am;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("������С���");
			double money = scan.nextDouble();
			boolean b = money > 156.7;

			System.out.print("С����֧����");
			System.out.println(b);
			if (money>1000) {
				break;
			}
		}
		scan.close();
	}
}
