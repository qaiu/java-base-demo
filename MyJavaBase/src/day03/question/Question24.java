package day03.question;
import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������a��");
		int a=scanner.nextInt();
		System.out.println("������b��");
		int b=scanner.nextInt();
		System.out.println("������c��");
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
		System.out.println("��С��������");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scanner.close();
	}
}
