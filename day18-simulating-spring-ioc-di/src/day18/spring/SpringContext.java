package day18.spring;


import java.io.File;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//spring�����Ķ���,�����Զ�����ʵ��,����ʵ������һ��������
public class SpringContext {
	private Map<String, Object> map = new HashMap<>();
	
	/*
	 * �Զ���binĿ¼��,ɨ�����е�class�ļ�,������ʵ��,����Map����
	 */
	public void autoScan() throws Exception{
		String path = SpringContext.class.getResource("/").getPath();
		path = URLDecoder.decode(path, "UTF-8");
		StringBuilder pkg = new StringBuilder();
		//ɨ��Ŀ¼pkg�����������
		scan(new File(path), pkg);
		//����Զ�װ��,�������е�ʵ��
		autowire();
		
	}
	/*
	 * map
	 * 		key						  value
	 * day18.spring.UserDao			UserDaoʵ��
	 * day18.spring.UserService		UserServiceʵ��
	 * day18.spring.UserController	UserControllerʵ��
	 */
	private void autowire() throws Exception {
		Collection<Object> values = map.values();
		for (Object obj : values) {
			Class<? extends Object> c = obj.getClass();
			Field[] a = c.getDeclaredFields();
			for (Field f : a) {
				
				if (f.isAnnotationPresent(Value.class)) {
					//ע����������
					injectValue(c,obj,f);
				} else if (f.isAnnotationPresent(Autowired.class)) {
					//ע�����
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
		
		//��o2���󱣴浽objʵ��
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
			
			if (f.isFile()) {//f���ļ�
				if (n.endsWith(".class")) {
					// "A.class" --ɾ����׺--> "A" --ƴ����--> "aa.bb.cc.A"
					String className = pkg+"."+n.substring(0,n.length() - 6);
					try {
						//���䴴��ʵ��
						Class<?> c = Class.forName(className);
						if (c.isAnnotationPresent(Component.class)||
								c.isAnnotationPresent(Controller.class)||
								c.isAnnotationPresent(Service.class)) {
							//��ʵ������map����
							Object obj = c.newInstance();
							map.put(className,obj);
						}
						System.out.println(map);
					} catch (Exception e) {
						System.out.println(className+"���ܴ���ʵ��");
					}
				}
			} else {//f���ļ���
				if (pkg.length() != 0) {
					pkg.append(".");
				}
				pkg.append(f.getName());
				System.out.println(pkg);
				scan(f,pkg);//�ݹ鴦��f��Ŀ¼
				//�ݹ鴦�����
				//����е�,������λ�õ�ĩβɾ����,���û�е�ֱ�����
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
		String n = c.getName(); //��ò�����������������
		return (T)map.get(n);   //������Ϊ��,��ȡ��Ӧ��ʵ��
	}
	
	public static void main(String[] args) throws Exception {
		Configure.load();
		SpringContext c = new SpringContext();
		c.autoScan();
		
		UserController cont =c.getObject(UserController.class);
		cont.test();
	
		
	}
	
	
}
