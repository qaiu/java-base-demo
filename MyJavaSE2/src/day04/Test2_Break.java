package day04;

import java.util.Scanner;

public class Test2_Break {
	public static void main(String[] args) {
		//接受用户输入的100次数字
		for (int i = 0; i < 100; i++) {
			int input = new Scanner(System.in).nextInt();
			
			if (input == 88) {
				break;
			}
		}
		
	}
}
