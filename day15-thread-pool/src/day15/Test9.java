package day15;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test9 {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		
		Student s = new Student();
		//��ȡgender����
		Field g = c.getDeclaredField("gender");//Declared���Ի�ȡ˽�б���
		System.out.println(g);
		
		//ʹ˽�еı������Ա�����
		g.setAccessible(true);
		
		g.set(s, "Ů");
		
		Object v = g.get(s);
		System.out.println(v);
		
		Method m = c.getDeclaredMethod("f1", String.class);
		
		m.setAccessible(true);
		m.invoke(s, "����������");
		
		Method get = c.getMethod("getAge");
		Method set = c.getMethod("setAge", int.class);
		
		set.invoke(s,10);
		
		Object r = get.invoke(s);
		System.out.println(r);
		
	}
}
