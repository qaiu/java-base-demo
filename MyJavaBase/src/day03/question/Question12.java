package day03.question;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ѽ�");
		double money = scanner.nextDouble();

		System.out.println("������鵽���ۿۣ�");
		double discount = scanner.nextDouble();
		
		money = money*discount/10;
		
		System.out.println("�ۺ�۸�Ϊ��"+money);

		scanner.close();
	}

}
