package day03.am;
import java.util.Scanner;

public class ShopTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������֧������");
		int zhifubao = scan.nextInt();
		System.out.println("������΢����");
		int wechat=scan.nextInt();
		boolean b = zhifubao>=620||wechat>=620;
		System.out.println("С���ܹ�֧���ǣ�"+b);
		scan.close();
	}

}
