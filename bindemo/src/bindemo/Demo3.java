package bindemo;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		
		char[] buf = new char[32];
		char[] temp = new char[32];
		boolean flag = false;
		if (num < 0) {
			num = -num;
			flag = true;
		}
		
		int i = 0;
		while(num > 0) {
			buf[i++]=(char)(num%2 + '0');
			num/=2;
		}

		for (int j = buf.length - 1; j >=0 ; j--) {
			temp[buf.length-1-j] = buf[j];
		}
		String string = new String(temp).trim();
		
		//取反加1
		if (flag) {
			
		}

		System.out.println(string);
	}
}
