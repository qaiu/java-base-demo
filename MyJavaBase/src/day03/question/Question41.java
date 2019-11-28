package day03.question;

import java.util.Random;
import java.util.Scanner;
// 猜数字
public class Question41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();
		int r = ran.nextInt(100)+1;
		int i = 0;
		while (true) {
			++i;
			System.out.println("请输入一个数字：");
			int num = scanner.nextInt();
			if (num > r) {

				System.out.println("大了");
			} else if (num < r) {

				System.out.println("小了");
			} else {
				System.out.println("对了");
				break;
			}
		}
		
		System.out.println("你猜的总次数为：" + i);
		scanner.close();
	}

}
