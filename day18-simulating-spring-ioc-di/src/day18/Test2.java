package day18;

import java.lang.reflect.Field;

import day18.spring.Configure;
import day18.spring.UserDao;
import day18.spring.Value;

public class Test2 {
	public static void main(String[] args) throws Exception{
		Configure.load();
		//新建Dao实例,并自动填充他的属性
		UserDao dao = new UserDao();
		Class<UserDao> c = UserDao.class;
		Field[] a = c.getDeclaredFields();
		
		for (Field f : a) {
			//变量上是否存在@Value注解
			System.out.println(">>>"+f);
			if(f.isAnnotationPresent(Value.class)) {
				Value value = f.getAnnotation(Value.class);
				String ognl = value.ognl();
				if ("".equals(ognl)) {
					ognl = value.value();
				}
				//从配置文件,获取配置数据
				String v = Configure.get(ognl);
				//私有变量设为公有
				f.setAccessible(true);
				//把取出的配置数据,保存到变量f
				f.set(dao,v);
			}
		}
		dao.test();
	}
}
