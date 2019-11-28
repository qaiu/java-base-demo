package day03;

import java.util.Scanner;

public class Test2_if {
	public static void main(String[] args) {
		//1. 接受键盘输入原价
		double price = new Scanner(System.in).nextDouble();
		double result = price;//定义变量记录折后价
		
		//2.判断,原价打几折
		if (price >= 5000) {
			result = price * 0.5;//打五折
		}else if (price >= 2000) {
			result = price * 0.8;//打八折
		}else if (price > 1000) {
			result = price * 0.9;//打九折
		}
		
		System.out.println("折后价是:"+result);
		
	}
}
