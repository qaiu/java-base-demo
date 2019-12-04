package day03.question;
import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入a：");
		int a=scanner.nextInt();
		System.out.println("请输入b：");
		int b=scanner.nextInt();
		System.out.println("请输入c：");
		int c=scanner.nextInt();
		
		if (a > b) {
			a=a^b;
	        b=a^b;
	        a=a^b;
		}
		if (a > c){
			a=a^c;
	        c=a^c;
	        a=a^c;
		}
		if (b > c){
			b=b^c;
	        c=b^c;
	        b=b^c;
		}
		System.out.println("从小到大排列");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scanner.close();
	}
}
