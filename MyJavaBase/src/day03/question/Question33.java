package day03.question;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��һ����״����1�����Ρ�2�����Ρ�3�����Ρ�4Բ�Σ�");
		int shape = scanner.nextInt();
		
		switch(shape) {
		case 1:
			System.out.println("�����볤��");
			double length = scanner.nextDouble();
			System.out.println("��������");
			double width = scanner.nextDouble();
			System.out.println("���Ϊ"+length*width);
			break;
		case 2:
			System.out.println("������߳�");
			double side = scanner.nextDouble();
			System.out.println("���Ϊ"+side*side);
			break;
		case 3:
			System.out.println("������ױ߳���");
			double bottom = scanner.nextDouble();
			System.out.println("�������");
			double heigth = scanner.nextDouble();
			System.out.println("���Ϊ"+bottom*heigth/2);
			break;
		case 4:
			System.out.println("������뾶");
			double r = scanner.nextDouble();
			System.out.println("���Ϊ"+3.14*r*r);
			break;
		}
		scanner.close();
	}

}
