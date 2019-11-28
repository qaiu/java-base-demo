package fanshe;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//1.����Class����
		Class cl = Class.forName("fanshe.Student");

		//2.��ȡ���й��й��췽��
		System.out.println("**********************���й��й��췽��*********************************");
		Constructor[] conArray = cl.getConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}

		System.out.println("************���еĹ��췽��(������˽�С��ܱ�����Ĭ�ϡ�����)***************");
		conArray = cl.getDeclaredConstructors();
		for(Constructor c : conArray){
			System.out.println(c);
		}
		
		Constructor c1 = cl.getDeclaredConstructor(String.class);
		c1.newInstance("123");

		System.out.println("*****************��ȡ���С��޲εĹ��췽��*******************************");
		Constructor con = cl.getConstructor(null);
		//1>����Ϊ���޲εĹ��췽������������һ��null,��дҲ���ԣ�������Ҫ����һ�����������͵�Class����
		//2>�����ص�����������޲ι��캯���������

		System.out.println("con = " + con);
		//�����޲ι��췽��
		Object obj = con.newInstance();

		System.out.println("******************��ȡ˽�й��췽����������*******************************");
		con = cl.getDeclaredConstructor(char.class);
		System.out.println(con);
		//���ù��췽��
		con.setAccessible(true);//���Ե��������η�
		obj = con.newInstance('A');


		//2.��ȡ�ֶ�
		System.out.println("************��ȡ���й��е��ֶ�********************");
		Field[] fieldArray = cl.getFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");
		fieldArray = cl.getDeclaredFields();
		for(Field f : fieldArray){
			System.out.println(f);
		}
		System.out.println("*************��ȡ�����ֶ�**������***********************************");
		Field f = cl.getField("name");
		System.out.println(f);
		//Ϊ�ֶ�����ֵ
		f.set(obj, "С��");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"
		//��֤
		Student stu = (Student)obj;
		System.out.println("��֤������" + stu.name);


		System.out.println("**************��ȡ˽���ֶ�****������********************************");
		f = cl.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);//���˽���޶�
		f.set(obj, "18888889999");
		System.out.println("��֤�绰��" + stu);

		//3.��ȡ���й��з���
		System.out.println("***************��ȡ���еġ����С�����*******************");
		cl.getMethods();
		Method[] methodArray = cl.getMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		System.out.println("***************��ȡ���еķ���������˽�е�*******************");
		methodArray = cl.getDeclaredMethods();
		for(Method m : methodArray){
			System.out.println(m);
		}
		System.out.println("***************��ȡ���е�show1()����*******************");
		Method m = cl.getMethod("show1", String.class);
		System.out.println(m);
		m.invoke(obj, "С��");

		System.out.println("***************��ȡ˽�е�show4()����******************");
		m = cl.getDeclaredMethod("show4", int.class);
		System.out.println(m);
		m.setAccessible(true);//���˽���޶�
		Object result = m.invoke(obj, 20);//��Ҫ����������һ����Ҫ���õĶ��󣨻�ȡ�з��䣩��һ����ʵ��
		System.out.println("����ֵ��" + result);

		Method methodMain = cl.getMethod("main", String[].class);//��һ���������������ƣ��ڶ��������������βε����ͣ�


		//4������main����
		// methodMain.invoke(null, new String[]{"a","b","c"});
		//��һ���������������ͣ���Ϊ������static��̬�ģ�����Ϊnull���ԣ��ڶ���������String���飬����Ҫע����jdk1.4ʱ�����飬jdk1.5֮���ǿɱ����
		//������ʱ��  new String[]{"a","b","c"} ���3�����󡣡���������Ҫ����ǿת��
		methodMain.invoke(null, (Object)new String[]{"a","b","c"});//��ʽһ
		// methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//��ʽ��
	}

}