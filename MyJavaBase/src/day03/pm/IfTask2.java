package day03.pm;

import java.util.Scanner;
public class IfTask2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ѽ��");
		double cons=scanner.nextDouble();
		
		if (cons>=500) {
			cons *=.85;
		}
		System.out.println("ʵ�����ѽ�"+cons);
		scanner.close();
	}
}
