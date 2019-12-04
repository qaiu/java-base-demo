package day03.question;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择一个形状：（1长方形、2正方形、3三角形、4圆形）");
		int shape = scanner.nextInt();
		
		switch(shape) {
		case 1:
			System.out.println("请输入长度");
			double length = scanner.nextDouble();
			System.out.println("请输入宽度");
			double width = scanner.nextDouble();
			System.out.println("面积为"+length*width);
			break;
		case 2:
			System.out.println("请输入边长");
			double side = scanner.nextDouble();
			System.out.println("面积为"+side*side);
			break;
		case 3:
			System.out.println("请输入底边长度");
			double bottom = scanner.nextDouble();
			System.out.println("请输入高");
			double heigth = scanner.nextDouble();
			System.out.println("面积为"+bottom*heigth/2);
			break;
		case 4:
			System.out.println("请输入半径");
			double r = scanner.nextDouble();
			System.out.println("面积为"+3.14*r*r);
			break;
		}
		scanner.close();
	}

}
