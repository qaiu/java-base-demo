package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * �����вη���
 * @author QAIU
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("reflect.Student");
		Constructor<?> con = cls.getConstructor(String.class,int.class);
		Object obj = con.newInstance("С��",12);
		System.out.println(obj);
		
		
		Field[] fs = cls.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getGenericType()+" "+f.getName());
			
		}
		
		//����˽�з���
		Method method = cls.getDeclaredMethod("hh");
		//���ÿɷ���
		method.setAccessible(true);
		//����
		method.invoke(obj);
		
	}  
}
