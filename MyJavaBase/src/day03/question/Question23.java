package day03.question;
import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = scanner.nextInt();
		
		if (num>9999||num<1000) {
			System.out.println("������Ļ�Ա������");
		}
		else {
			
			System.out.println("��¼�ɹ�");
		}
		scanner.close();
	}

}
