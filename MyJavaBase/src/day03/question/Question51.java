package day03.question;

public class Question51 {
	public static void main(String[] args) {
		double money = 1;
		double sum = 0;
		int day=1;
		while (money<10) {
			System.out.println(money+">"+day);
			money*=1.5;
			day++;
		}
		System.out.println("存到第"+day+"天，金额超过10元");
		money=1;
		sum=0;
		for (int i = 0; i < 30; i++) {
			sum+=money;
			money*=1.5;
		}
		
		System.out.println("一个月后一共存了"+sum+"元");
	}

}
