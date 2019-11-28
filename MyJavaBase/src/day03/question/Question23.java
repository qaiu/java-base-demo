package day03.question;
import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		int num = scanner.nextInt();
		
		if (num>9999||num<1000) {
			System.out.println("您输入的会员号有误");
		}
		else {
			
			System.out.println("登录成功");
		}
		scanner.close();
	}

}
