package day04;

import java.util.Scanner;

public class Test2_Break {
	public static void main(String[] args) {
		//�����û������100������
		for (int i = 0; i < 100; i++) {
			int input = new Scanner(System.in).nextInt();
			
			if (input == 88) {
				break;
			}
		}
		
	}
}
