package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Java反射机制
 * 反射是一种动态机制,允许我们在程序运行期间
 * 实例化对象,调用方法,操作属性等
 * 
 * 反射可以提高代码的灵活度,但会带来更多的系统开销和较慢的运行效率
 * 因此反射只在关键地方用 不能过度依赖
 * 反射是见机行事
 * 之前是按原计划进行
 * @author QAIU
 *
 */
public class ReflectDemo1 {
	/**
	 * Class类,类的类对象
	 * JVM加载一个类时,会连同实例化一个Class实例
	 * 通过它可以获取类的一切信息
	 * 获取类名,方法,属性,构造器等等
	 * 并且可以调用他们
	 * 
	 * 反射的第一步操作类的类对象
	 * 从而在运行期间得到类的相关信息
	 * 以便于进行操作
	 * 1:类名.class
	 * Java中任何类都可以这样做
	 * 但是这种是通过硬编码的形式获取,不灵活 但是直接
	 *  Class cls = int.class;
	 *  Class cls = String.class
	 *  
	 * 2: Class.forName(String ClassName)
	 * 通过Class的静态方法forName获取
	 * 这里传入的参数为要加载类的完全限定名
	 * 包名.类名  比如:
	 *   Class cls = Class.forName(java.lang.String)
	 * 
	 * 3:通过 类加载器ClassLoader获取
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		//加载String类对象
		Class cls = String.class;
		//		
		//		Class cls2 = Class.forName("java.lang.String");
		//		//通过Class获取其表示的类的所有方法
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
