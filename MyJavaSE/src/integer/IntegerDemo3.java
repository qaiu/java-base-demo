package integer;
/**
 * JDK1.5推出了一个新特性：自动拆装箱
 * 该特性允许我们可以在源代码中可以让基本类型与对应的
 * 包装类之间相互赋值使用 无需添加额外的转换代码了
 * 但是该特性是编译器认可的，实际上编译期将源代码
 * 编译为class文件时会添加转化代码
 * @author QAIU
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		// 自动拆装箱
		/*
		 * 这里会触发编译器的自动拆装箱特性
		 * 编译器会在编译期间将包装类转换为基本类型
		 * 下面代码会变为：
		 * int a = new Integer(1).intValue()
		 */
		int a = new Integer(1);
		/*
		 * 这里触发自动装箱特性，编译器会改代码为：
		 * Integer i = Integer.valueOf(a)
		 */
		Integer i = a;
		System.out.println(i);
		
	}
}
