package day03.question;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double money = scanner.nextDouble();

		System.out.println("请输入抽到的折扣：");
		double discount = scanner.nextDouble();
		
		money = money*discount/10;
		
		System.out.println("折后价格为："+money);

		scanner.close();
	}

}
