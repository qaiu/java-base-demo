package day03.question;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = scanner.nextInt();
		
		if (num>9999||num<1000) {
			System.out.println("�����ֲ�����λ��");
		}
		else {
			int sum = num/1000+num%1000/100+num%100/10+num%10;
			System.out.println("��λ����֮��Ϊ��"+sum);
		}
		scanner.close();
	}

}
