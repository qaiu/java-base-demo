package day05;
import java.util.Scanner;
public class ForTask {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入5个学生 成绩");
		double sumScore=0;
		for (int i = 0; i < 5; i++) {
			sumScore+=scanner.nextDouble();
		}
		System.out.println("平均成绩是"+sumScore/5.0);
		
		scanner.close();
	}

}
