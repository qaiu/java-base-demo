package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ʹ�÷�����÷���
 * @author QAIU
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Person p = new Person();
//		p.sayHello();
		
		System.out.println("����������:");
		Scanner scan = new Scanner(System.in);
		String oname = scan.nextLine();
		//���������
		Class cls  = Class.forName(oname);
		//ͨ�������ʵ����
		Object o = cls.newInstance();
		System.out.println("�����뷽����:");
		String omethod = scan.nextLine();
		//���÷����ȡҪ���õķ���
		Method method = cls.getMethod(omethod);
		//���ø÷���
		method.invoke(o);
		
	}
}
