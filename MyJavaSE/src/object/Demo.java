package object;
/**
 * 使用当前类测试Object相关方法
 * @author QAIU
 *
 */
public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		/*
		 * System.out.println(Object obj)
		 * 该方法将给定的对象输出到控制台时，
		 * 会调用该对象的toString将返回的字符串输出
		 * 而Object定义的toString返回的字符串
		 * 格式：类名@地址
		 * 这对于实际应用中意义不大.
		 */
		System.out.println(p);
		/*
		 * 任何引用类型和字符串连接结果都是字符串
		 * 而java运行时实际操作是调用其toString方法
		 * 将返回的字符串与字符串连接的
		 */
		String str = "point:" + p;
		System.out.println(str);
		
		Point p2 = new Point(1, 2);	
		/*
		 * 对于引用类型而言，我们判断相等有两种方式，第一种是"=="
		 * "=="成为等值判断，是比较两个变量的值是否相等
		 * 对于引用类型而言，变量存的是地址，所以当"=="为true时
		 * 说明两个引用指向的是同一个对象
		 */
		System.out.println(p==p2);//false
		
		/*
		 * 第二种是"equals"方法
		 * equals方法是Object定义的方法，
		 * 设计意图是比较两个引用类型变量指向的对象"内容相等"
		 * 但是该方法需要重写，因为Object提供的该方法内部使用"=="比较的
		 * 不重写没有任何意义
		 */
		System.out.println(p.equals(p2));//true
	
		Integer aInteger;
		
		
		
	}
}
