package day05;
import java.util.Scanner;
public class ForTask {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������5��ѧ�� �ɼ�");
		double sumScore=0;
		for (int i = 0; i < 5; i++) {
			sumScore+=scanner.nextDouble();
		}
		System.out.println("ƽ���ɼ���"+sumScore/5.0);
		
		scanner.close();
	}

}
