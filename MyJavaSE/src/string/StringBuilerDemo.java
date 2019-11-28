package string;
/**
 * java.lang.StringBuilder
 * 该类是专门用来修改字符串的API，其内部维护了一个可变char数组
 * 因此不会出现修改一次就创建一个新对象的问题（内存开销小，性能好）
 * 并且StringBuilder还提供了修改字符串内容的
 * 一系列操作：增，删，改，插
 * @author QAIU
 *
 */
public class StringBuilerDemo {
	public static void main(String[] args) {
		String str = "努力学习java";
		//默认实例化出来表示一个空字符串
		//StringBuilder builder = new StringBuilder();
		StringBuilder builder = new StringBuilder(str);
		
		/*
		 * 努力学习java
		 * 努力学习java,为了找个好工作
		 */
		builder.append(",为了找个好工作");
		//调用toString方法可以获得修改后的字符串
		str = builder.toString();
		System.out.println(str);
		/* 
		 * 努力学习java,为了找个好工作
		 * 努力学习java,就是为了改变世界
		 */
		builder.replace(9, 16, "就是为了改变世界");
		/*
		 * 输出时直接输出builder也可以
		 * 因为输出方法内部会调用builder的toString方法
		 * 将返回的字符串输出
		 */
		System.out.println(builder);
		/*
		 * 努力学习java,就是为了改变世界
		 * ,就是为了改变世界
		 */
		builder.delete(0, 8);
		System.out.println(builder);
		/*
		 * ,就是为了改变世界
		 * 活着,就是为了改变世界
		 */
		builder.insert(0, "活着");
		System.out.println(builder);

		builder.insert(0, true);
		System.out.println(builder);
	}
	
	
	
	
	
	
	
	
	
	
	
}
