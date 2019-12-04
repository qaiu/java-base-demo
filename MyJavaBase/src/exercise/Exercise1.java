package exercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.out.println("请输入正方形边长：");
		Scanner scanner=new Scanner(System.in);
		
		int side=scanner.nextInt();
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++) {
				if (i==0||i==side-1||j==0||j==side-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		scanner.close();
	}

}
