package day03.am;
import java.util.Scanner;
public class ModelTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ߣ�");
		double height = scan.nextDouble();
		System.out.println("���������أ�");
		int bodyWeight=scan.nextInt();
		boolean b = height>1.7&&bodyWeight<50;
		System.out.println("С������ģ���ǣ�"+b);
	}

}
