package day03.question;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		double score = scanner.nextDouble();
		score += score*.2;
		
		System.out.println("�ӷֺ�ĳɼ�Ϊ��"+score);

		scanner.close();
	}

}
