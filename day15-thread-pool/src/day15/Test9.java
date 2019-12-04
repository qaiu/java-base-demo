package day15;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test9 {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		
		Student s = new Student();
		//获取gender变量
		Field g = c.getDeclaredField("gender");//Declared可以获取私有变量
		System.out.println(g);
		
		//使私有的变量可以被访问
		g.setAccessible(true);
		
		g.set(s, "女");
		
		Object v = g.get(s);
		System.out.println(v);
		
		Method m = c.getDeclaredMethod("f1", String.class);
		
		m.setAccessible(true);
		m.invoke(s, "哈哈哈哈哈");
		
		Method get = c.getMethod("getAge");
		Method set = c.getMethod("setAge", int.class);
		
		set.invoke(s,10);
		
		Object r = get.invoke(s);
		System.out.println(r);
		
	}
}
