package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author QAIU
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("reflect.Student");
		Constructor<?> con = cls.getConstructor(String.class,int.class);
		Object obj = con.newInstance("小明",12);
		System.out.println(obj);
		
		
		Field[] fs = cls.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getGenericType()+" "+f.getName());
			
		}
		
		//调用私有方法
		Method method = cls.getDeclaredMethod("hh");
		//设置可访问
		method.setAccessible(true);
		//调用
		method.invoke(obj);
		
	}  
}
