package day03.question;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		double score = scanner.nextDouble();
		score += score*.2;
		
		System.out.println("加分后的成绩为："+score);

		scanner.close();
	}

}
