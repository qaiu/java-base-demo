package day03.question;
import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入机票原价：");
		double money = scanner.nextDouble();

		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		
		System.out.println("请输入舱位类型：头等舱或经济舱");
		String  type = scanner.next();
		
		if (month>=5&&month<=10) {
			if(type.equals("头等舱")) {
				money *= .9;
			}
			else if (type.equals("经济舱")){
				money *= .85;
			}
		}
		else {
			if(type.equals("头等舱")) {
				money *= .7;
			}
			else if (type.equals("经济舱")){
				money *= .65;
			}
		}
		System.out.println("机票价格为："+money);
		scanner.close();
	}

}
