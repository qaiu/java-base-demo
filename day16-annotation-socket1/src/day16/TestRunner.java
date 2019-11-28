package day16;

import java.lang.reflect.Method;

public class TestRunner {
	
	public static void launch(Class<?> c) throws Exception{
		Object obj = c.newInstance(); //新建示例并执行构造
		Method[] a = c.getMethods();//获取所有方法
		
		for (Method t : a) {
			//判断是否存在@Test 注解
			if(t.isAnnotationPresent(Test.class)) {
				//执行这个方法
				run(obj,t);
			}
		}
	}
	
	private static void run( Object obj, Method t) throws Exception {
		//先获取注解属性数据
		Test test = t.getAnnotation(Test.class);
		//id title 如果没有title,用value作为title
		String title = test.title();
		int id = test.id();
		if("".equals(title)) {
			title = test.value();
		}
		
		System.out.println("id = "+id);
		System.out.println("title = "+title);
		t.invoke(obj);
		System.out.println("-----------------");
		
	}
	
	public static void main(String[] args) throws Exception {
		launch(A.class);
	}
}
