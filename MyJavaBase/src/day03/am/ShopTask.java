package day03.am;
import java.util.Scanner;

public class ShopTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入支付宝余额：");
		int zhifubao = scan.nextInt();
		System.out.println("请输入微信余额：");
		int wechat=scan.nextInt();
		boolean b = zhifubao>=620||wechat>=620;
		System.out.println("小红能够支付是："+b);
		scan.close();
	}

}
