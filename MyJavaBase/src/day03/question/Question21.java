package day03.question;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ѽ�");
		double money = scanner.nextDouble();
		
		if (money*.8>=1000) {
			System.out.println("��ϲ�����200Ԫ�Ż�ȯ1��");
		}

		scanner.close();
	}

}
