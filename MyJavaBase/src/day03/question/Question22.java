package day03.question;
import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = scanner.nextInt();
		
		if (year%4==0 && year%100!=0 || year % 400 == 0) {
			System.out.println(year+"������");
		}
		else
			System.out.println(year+"��ƽ��");

		scanner.close();
	}

}
