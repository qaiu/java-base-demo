package day05;
import java.util.Scanner;
public class BreakTask2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int keyWord=0;
		System.out.println("���������룺");
		int i=0;
		for(;;) {
			keyWord = scanner.nextInt();
			i++;
			if (keyWord==123456) {
				break;
			}
			System.out.println("�������");
		}
		System.out.println("ѭ����"+i+"��");
		scanner.close();
	}

}
