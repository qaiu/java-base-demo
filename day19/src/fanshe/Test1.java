package fanshe;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//1.加载Class对象
		Class cl = Class.forName("fanshe.Student");

		//2.获取所有公有构造方法
		System.out.println("**********************所有公有构造方法*********************************");
		Constructor[] conArray = cl.getConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}

		System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
		conArray = cl.getDeclaredConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}
		
		Constructor c1 = cl.getDeclaredConstructor(String.class);
		c1.newInstance("123");

		System.out.println("*****************获取公有、无参的构造方法*******************************");
		Constructor con = cl.getConstructor(null);
		//1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型的Class对象
		//2>、返回的是描述这个无参构造函数的类对象。

		System.out.println("con = " + con);
		//调用无参构造方法
		Object obj = con.newInstance();

		System.out.println("******************获取私有构造方法，并调用*******************************");
		con = cl.getDeclaredConstructor(char.class);
		System.out.println(con);
		//调用构造方法
		con.setAccessible(true);//忽略掉访问修饰符
		obj = con.newInstance('A');


		//2.获取字段
		System.out.println("************获取所有公有的字段********************");
		Field[] fieldArray = cl.getFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
		fieldArray = cl.getDeclaredFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("*************获取公有字段**并调用***********************************");
		Field f = cl.getField("name");
		System.out.println(f);
		//为字段设置值
		f.set(obj, "小明");//为Student对象中的name属性赋值--》stu.name = "刘德华"
		//验证
		Student stu = (Student)obj;
		System.out.println("验证姓名：" + stu.name);


		System.out.println("**************获取私有字段****并调用********************************");
		f = cl.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);//解除私有限定
		f.set(obj, "18888889999");
		System.out.println("验证电话：" + stu);

		//3.获取所有公有方法
		System.out.println("***************获取所有的”公有“方法*******************");
		cl.getMethods();
		Method[] methodArray = cl.getMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		System.out.println("***************获取所有的方法，包括私有的*******************");
		methodArray = cl.getDeclaredMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		System.out.println("***************获取公有的show1()方法*******************");
		Method m = cl.getMethod("show1", String.class);
		System.out.println(m);
		m.invoke(obj, "小明");

		System.out.println("***************获取私有的show4()方法******************");
		m = cl.getDeclaredMethod("show4", int.class);
		System.out.println(m);
		m.setAccessible(true);//解除私有限定
		Object result = m.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
		System.out.println("返回值：" + result);

		Method methodMain = cl.getMethod("main", String[].class);//第一个参数：方法名称，第二个参数：方法形参的类型，


		//4、调用main方法
		// methodMain.invoke(null, new String[]{"a","b","c"});
		//第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数
		//这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。。。所以需要将它强转。
		methodMain.invoke(null, (Object)new String[]{"a","b","c"});//方式一
		// methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//方式二
	}

}