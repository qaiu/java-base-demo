package reflect;

import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 * @author QAIU
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//实例化Person
		Person p = new Person();
		System.out.println(p);
		
		// 通过反射加载实例化对象
		Scanner scanner=new Scanner(System.in);
		String string = scanner.nextLine();
		Object o = Class.forName(string).newInstance();
		/*
		 * 通过类对象实例化
		 * Class.newInstance()方法
		 * 实例化其表示的类的对象,必须有无参构造器
		 */
		System.out.println(o);
	}
}
