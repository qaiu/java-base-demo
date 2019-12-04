package day03.am;
import java.util.Scanner;
public class ModelTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身高：");
		double height = scan.nextDouble();
		System.out.println("请输入体重：");
		int bodyWeight=scan.nextInt();
		boolean b = height>1.7&&bodyWeight<50;
		System.out.println("小红能做模特是："+b);
	}

}
