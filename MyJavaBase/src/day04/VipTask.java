package day04;

import java.util.Scanner;

public class VipTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��������֣�");
		int integral = scanner.nextInt();
		if (integral >= 5000) {
			System.out.println("��Ա������Ϊ�ڽ�");
		} else if (integral >= 2000) {
			System.out.println("��Ա������Ϊ����");
		} else if (integral >= 1000) {
			System.out.println("��Ա������Ϊ��");
		} else
			System.out.println("��Ա������Ϊ����");
		scanner.close();
	}
}
