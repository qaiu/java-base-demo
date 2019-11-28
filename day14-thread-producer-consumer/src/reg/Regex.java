package reg;

import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {
		System.out.println("请输入你的QQ号");
		Scanner scan = new Scanner(System.in);

		while(true) {
			String qq = scan.nextLine();

			if (qq.matches("^[\\d&&[^0]]\\d{4,9}")) {
				System.out.println("是QQ号");
			}else {
				System.out.println("不是QQ号");
			}
		}
	}
}
