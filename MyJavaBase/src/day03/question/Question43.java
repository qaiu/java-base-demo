package day03.question;
import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag=false;
		for (int i = 1; i <= 5; i++) {
			System.out.println("�������"+i+"������");
			int num=scanner.nextInt();
			if (num<0)
				flag=true;
				
		}
		if (flag) {
			System.out.println("��Щ�����и���");
		}
		else {
			System.out.println("��Щ����û�и���");
		}
		scanner.close();
	}

}
