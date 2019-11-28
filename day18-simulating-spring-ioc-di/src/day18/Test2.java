package day18;

import java.lang.reflect.Field;

import day18.spring.Configure;
import day18.spring.UserDao;
import day18.spring.Value;

public class Test2 {
	public static void main(String[] args) throws Exception{
		Configure.load();
		//�½�Daoʵ��,���Զ������������
		UserDao dao = new UserDao();
		Class<UserDao> c = UserDao.class;
		Field[] a = c.getDeclaredFields();
		
		for (Field f : a) {
			//�������Ƿ����@Valueע��
			System.out.println(">>>"+f);
			if(f.isAnnotationPresent(Value.class)) {
				Value value = f.getAnnotation(Value.class);
				String ognl = value.ognl();
				if ("".equals(ognl)) {
					ognl = value.value();
				}
				//�������ļ�,��ȡ��������
				String v = Configure.get(ognl);
				//˽�б�����Ϊ����
				f.setAccessible(true);
				//��ȡ������������,���浽����f
				f.set(dao,v);
			}
		}
		dao.test();
	}
}
