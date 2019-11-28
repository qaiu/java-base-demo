package day03.question;
import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if (i%7!=0&&i%10!=7 && i/10!=7) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
