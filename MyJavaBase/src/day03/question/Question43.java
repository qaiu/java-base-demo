package day03.question;
import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag=false;
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第"+i+"个数：");
			int num=scanner.nextInt();
			if (num<0)
				flag=true;
				
		}
		if (flag) {
			System.out.println("这些数里有负数");
		}
		else {
			System.out.println("这些数里没有负数");
		}
		scanner.close();
	}

}
