package day05;
import java.util.Scanner;
public class BreakTask1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0;
		for(;;) {
			num = scanner.nextInt();
			if (num<0) {
				break;
			}
		}
		System.out.println("over");
		scanner.close();
	}

}
