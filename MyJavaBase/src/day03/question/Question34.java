package day03.question;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������һ����ݣ�");
		int year = scanner.nextInt();
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("�������31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("�������30��");
			break;
		case 2:
			if (year%4==0 && year%100!=0 || year % 400 == 0) {
				System.out.println("�������29��");
			}
			else
				System.out.println("�������28��");
			break;
		default:
			System.out.println("��������");
			break;
		}

		scanner.close();
	}

}
