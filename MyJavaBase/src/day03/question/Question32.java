package day03.question;
import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������Ʊԭ�ۣ�");
		double money = scanner.nextDouble();

		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		
		System.out.println("�������λ���ͣ�ͷ�Ȳջ򾭼ò�");
		String  type = scanner.next();
		
		if (month>=5&&month<=10) {
			if(type.equals("ͷ�Ȳ�")) {
				money *= .9;
			}
			else if (type.equals("���ò�")){
				money *= .85;
			}
		}
		else {
			if(type.equals("ͷ�Ȳ�")) {
				money *= .7;
			}
			else if (type.equals("���ò�")){
				money *= .65;
			}
		}
		System.out.println("��Ʊ�۸�Ϊ��"+money);
		scanner.close();
	}

}
