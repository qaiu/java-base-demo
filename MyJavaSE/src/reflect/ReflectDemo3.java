package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射调用方法
 * @author QAIU
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Person p = new Person();
//		p.sayHello();
		
		System.out.println("请输入类名:");
		Scanner scan = new Scanner(System.in);
		String oname = scan.nextLine();
		//加载类对象
		Class cls  = Class.forName(oname);
		//通过类对象实例化
		Object o = cls.newInstance();
		System.out.println("请输入方法名:");
		String omethod = scan.nextLine();
		//利用反射获取要调用的方法
		Method method = cls.getMethod(omethod);
		//调用该方法
		method.invoke(o);
		
	}
}
