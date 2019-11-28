package Jframetext;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		while (true) {
			System.out.println(calc());
		}
	}

	public static double calc() {
		Scanner scan = new Scanner(System.in);
		//		System.out.println("请输入一个表达式");
		String s = scan.nextLine();
		String[] inNum = s.split(" ");

		double n1 = Double.parseDouble(inNum[0]);
		double n2 = Double.parseDouble(inNum[2]);
		double result = 0;
		switch(inNum[1]) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
		case "/":
			result = n1 / n2;
		default:

			break;
		}
		return result;
	}
}
