package day16;

import java.lang.reflect.Method;

public class TestRunner {
	
	public static void launch(Class<?> c) throws Exception{
		Object obj = c.newInstance(); //�½�ʾ����ִ�й���
		Method[] a = c.getMethods();//��ȡ���з���
		
		for (Method t : a) {
			//�ж��Ƿ����@Test ע��
			if(t.isAnnotationPresent(Test.class)) {
				//ִ���������
				run(obj,t);
			}
		}
	}
	
	private static void run( Object obj, Method t) throws Exception {
		//�Ȼ�ȡע����������
		Test test = t.getAnnotation(Test.class);
		//id title ���û��title,��value��Ϊtitle
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
