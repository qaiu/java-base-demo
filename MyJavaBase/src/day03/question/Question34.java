package day03.question;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("这个月有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("这个月有30天");
			break;
		case 2:
			if (year%4==0 && year%100!=0 || year % 400 == 0) {
				System.out.println("这个月有29天");
			}
			else
				System.out.println("这个月有28天");
			break;
		default:
			System.out.println("输入有误");
			break;
		}

		scanner.close();
	}

}
