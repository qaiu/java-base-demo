package day03.question;

import java.util.Random;
import java.util.Scanner;
// ������
public class Question41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();
		int r = ran.nextInt(100)+1;
		int i = 0;
		while (true) {
			++i;
			System.out.println("������һ�����֣�");
			int num = scanner.nextInt();
			if (num > r) {

				System.out.println("����");
			} else if (num < r) {

				System.out.println("С��");
			} else {
				System.out.println("����");
				break;
			}
		}
		
		System.out.println("��µ��ܴ���Ϊ��" + i);
		scanner.close();
	}

}
