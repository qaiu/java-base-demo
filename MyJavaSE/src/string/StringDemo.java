package string;

/**
 * String是不变对象，即：字符串对象一旦创建，
 * 内容不可改变，改变要创建信息对象
 * 其中一个原因与常量池有关：
 * 字符串常量池：JVM在堆里有一段内存缓冲所有
 * 使用字面量形式创建的字符串对象，一旦我们使用
 * 已有的字面量再次创建字符串对象时会直接重用
 * 这样可以减少内存开销.
 * @author QAIU
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		//s2重用了s1对象
		System.out.println(s1==s2);
		//s3也重用了
		String s3 = "123abc";
		System.out.println(s1==s3);
		s1=s1+"!";
		System.out.println("s1:"+s1);
		System.out.println(s1==s2);
		
		//使用new的形式创建一定会产生新对象
		String s4=new String("123abc");
		//因此虽然s2和s4的内容一样，但是地址不同
		System.out.println("s4:"+s4);
		/*
		 * 字符串在比较时应当用equals方法比较
		 * 而不是使用"=="
		 */
		System.out.println(s2.equals(s4));
		/*
		 * 编译器有一个特性：在编译期间能确定一个表达式结果时
		 * 编译器会直接进行计算，并肩 结果编译到class文件里
		 * 例如下列代码会被编译器编译成
		 * String s5 = "123abc";
		 */
		String s5="123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s5==s2); //true
		
		String s="123";
		String s6=s+"abc";
		System.out.println("s6:"+s6);
		System.out.println(s6==s2); //false
		
		
		
		
		
		
		
		
		
		
		
	}

}
