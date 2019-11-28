package day03.pm;

import java.util.Scanner;
public class IfTask2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入消费金额");
		double cons=scanner.nextDouble();
		
		if (cons>=500) {
			cons *=.85;
		}
		System.out.println("实际消费金额："+cons);
		scanner.close();
	}
}
