package reg;

import java.util.Scanner;

public class Regex {
	public static void main(String[] args) {
		System.out.println("���������QQ��");
		Scanner scan = new Scanner(System.in);

		while(true) {
			String qq = scan.nextLine();

			if (qq.matches("^[\\d&&[^0]]\\d{4,9}")) {
				System.out.println("��QQ��");
			}else {
				System.out.println("����QQ��");
			}
		}
	}
}
