package day04;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ܼ���");
		int date=scanner.nextInt();
		switch (date) {
		case 1:
			System.out.println("������ؼ۲��ǻ��˼�");
			break;
		case 2:
			System.out.println("������ؼ۲��ǿ�Ѽ");
			break;
		case 3:
			System.out.println("������ؼ۲��������");
			break;
		case 4:
			System.out.println("������ؼ۲���������ţ��");
			break;
		case 5:
			System.out.println("������ؼ۲�����Ȼ����");
			break;

		default:
			System.out.println("����û���ؼ۲�");
			break;
		}
		scanner.close();
	}

}
