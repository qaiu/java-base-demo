package reflect;

import java.util.Scanner;

/**
 * ʹ�÷������ʵ��������
 * @author QAIU
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//ʵ����Person
		Person p = new Person();
		System.out.println(p);
		
		// ͨ���������ʵ��������
		Scanner scanner=new Scanner(System.in);
		String string = scanner.nextLine();
		Object o = Class.forName(string).newInstance();
		/*
		 * ͨ�������ʵ����
		 * Class.newInstance()����
		 * ʵ�������ʾ����Ķ���,�������޲ι�����
		 */
		System.out.println(o);
	}
}
