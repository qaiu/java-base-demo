package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Java�������
 * ������һ�ֶ�̬����,���������ڳ��������ڼ�
 * ʵ��������,���÷���,�������Ե�
 * 
 * ���������ߴ��������,������������ϵͳ�����ͽ���������Ч��
 * ��˷���ֻ�ڹؼ��ط��� ���ܹ�������
 * �����Ǽ�������
 * ֮ǰ�ǰ�ԭ�ƻ�����
 * @author QAIU
 *
 */
public class ReflectDemo1 {
	/**
	 * Class��,��������
	 * JVM����һ����ʱ,����ͬʵ����һ��Classʵ��
	 * ͨ�������Ի�ȡ���һ����Ϣ
	 * ��ȡ����,����,����,�������ȵ�
	 * ���ҿ��Ե�������
	 * 
	 * ����ĵ�һ��������������
	 * �Ӷ��������ڼ�õ���������Ϣ
	 * �Ա��ڽ��в���
	 * 1:����.class
	 * Java���κ��඼����������
	 * ����������ͨ��Ӳ�������ʽ��ȡ,����� ����ֱ��
	 *  Class cls = int.class;
	 *  Class cls = String.class
	 *  
	 * 2: Class.forName(String ClassName)
	 * ͨ��Class�ľ�̬����forName��ȡ
	 * ���ﴫ��Ĳ���ΪҪ���������ȫ�޶���
	 * ����.����  ����:
	 *   Class cls = Class.forName(java.lang.String)
	 * 
	 * 3:ͨ�� �������ClassLoader��ȡ
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		//����String�����
		Class cls = String.class;
		//		
		//		Class cls2 = Class.forName("java.lang.String");
		//		//ͨ��Class��ȡ���ʾ��������з���
		//		Method[] methods = cls.getMethods();
		//		for (Method method : methods) {
		//			System.out.println(method.getName());
		//		}
		/*
		 * java.util.HashMap
		 * java.util.Arrays
		 * java.util.ArrayList
		 * reflect.Person
		 */
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		cls = Class.forName(string);
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		scanner.close();


	}
}
