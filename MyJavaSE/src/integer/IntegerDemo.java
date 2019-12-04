package integer;
/**
 * 包装类
 * 包装类是为了解决基本类型不能直接面向对象开发而诞生的
 * 就是让基本类型可以以对象的形式存在
 * @author QAIU
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = 128;
		//基本类型转换为对应的包装类
		//Integer i1 = new Integer(a);
		//Integer i2 = new Integer(a);
		
		//java建议使用valueof转换
		Integer i1 = Integer.valueOf(a);
		Integer i2 = Integer.valueOf(a);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		//包装类转换为基本类型
		int d = i1.intValue();
		System.out.println(d);
		double dou = i1.doubleValue();
		System.out.println(dou);
		float f = i1.floatValue();
		System.out.println(f);
		byte b = i1.byteValue();
		System.out.println(b);
		/*
		 * 所有数字类型的包装类都有两个常量：
		 * MAX_VALUE，MIN_VALUE
		 * 用来记录基本类型的取值范围
		 */
		//获取int最大值
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
		double dmax = Double.MAX_VALUE;
		System.out.println(dmax);
	}
}
