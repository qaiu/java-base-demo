package day18.spring;


import java.io.File;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//spring上下文对象,用来自动创建实例,并把实例存入一个集合里
public class SpringContext {
	private Map<String, Object> map = new HashMap<>();
	
	/*
	 * 自动在bin目录下,扫描所有的class文件,并创建实例,放入Map集合
	 */
	public void autoScan() throws Exception{
		String path = SpringContext.class.getResource("/").getPath();
		path = URLDecoder.decode(path, "UTF-8");
		StringBuilder pkg = new StringBuilder();
		//扫描目录pkg用来处理包名
		scan(new File(path), pkg);
		//完成自动装配,遍历所有的实例
		autowire();
		
	}
	/*
	 * map
	 * 		key						  value
	 * day18.spring.UserDao			UserDao实例
	 * day18.spring.UserService		UserService实例
	 * day18.spring.UserController	UserController实例
	 */
	private void autowire() throws Exception {
		Collection<Object> values = map.values();
		for (Object obj : values) {
			Class<? extends Object> c = obj.getClass();
			Field[] a = c.getDeclaredFields();
			for (Field f : a) {
				
				if (f.isAnnotationPresent(Value.class)) {
					//注入配置数据
					injectValue(c,obj,f);
				} else if (f.isAnnotationPresent(Autowired.class)) {
					//注入对象
					injectObject(c,obj,f);
				}
			}
		}
	}

	private void injectValue(Class<? extends Object> c, Object obj, Field f) throws Exception {
		
		Value value = f.getAnnotation(Value.class);
		String ognl = value.ognl();
		if (ognl.equals("")) {
			ognl = value.value();
		}
		
		String v= Configure.get(ognl);
		f.setAccessible(true);
		f.set(obj, v);
	}
	
	private void injectObject(Class<? extends Object> c, Object obj, Field f) throws Exception {
		Class<?> type = f.getType();
		Object o2 = getObject(type);
		
		//吧o2对象保存到obj实例
		f.setAccessible(true);
		f.set(obj, o2);
	}
	
	private void scan(File dir,StringBuilder pkg) {
		File[] files = dir.listFiles();
		if (files == null) {
			return;
		}
		for (File f : files) {
			String n = f.getName();
			
			if (f.isFile()) {//f是文件
				if (n.endsWith(".class")) {
					// "A.class" --删掉后缀--> "A" --拼包名--> "aa.bb.cc.A"
					String className = pkg+"."+n.substring(0,n.length() - 6);
					try {
						//反射创建实例
						Class<?> c = Class.forName(className);
						if (c.isAnnotationPresent(Component.class)||
								c.isAnnotationPresent(Controller.class)||
								c.isAnnotationPresent(Service.class)) {
							//把实例放入map集合
							Object obj = c.newInstance();
							map.put(className,obj);
						}
						System.out.println(map);
					} catch (Exception e) {
						System.out.println(className+"不能创建实例");
					}
				}
			} else {//f是文件夹
				if (pkg.length() != 0) {
					pkg.append(".");
				}
				pkg.append(f.getName());
				System.out.println(pkg);
				scan(f,pkg);//递归处理f子目录
				//递归处理完毕
				//如果有点,把最后点位置到末尾删除掉,如果没有点直接清空
				int index = -1;
				if ((index = pkg.lastIndexOf(".")) == -1) {
					pkg.delete(0, pkg.length());
				} else {
					pkg.delete(index, pkg.length());
				}
				System.out.println(pkg);
			}
		}
	}
	
	public <T> T getObject(Class<T> c) {
		String n = c.getName(); //获得参数类对象的完整类名
		return (T)map.get(n);   //类名作为键,获取对应的实例
	}
	
	public static void main(String[] args) throws Exception {
		Configure.load();
		SpringContext c = new SpringContext();
		c.autoScan();
		
		UserController cont =c.getObject(UserController.class);
		cont.test();
	
		
	}
	
	
}
