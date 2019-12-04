package day03.am;
import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
		System.out.print("请您输入一个数字:");
	
		String contents1=input.next(); //输入字符串型
		System.out.println(contents1);
		
		int kkInteger=input.nextInt();
		System.out.println(kkInteger);
		
	}
}
