package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型: JDK5之后推出了一个新特性
 * 泛型也称为参数化类型
 * 指的是我们使用某个类时,指定定义的某个属性,方法的参数或返回值类型
 * 这样可以提高灵活性
 * 
 * 泛型的原型是Object,实际上编译器是将Object当做我们指定的类型
 * 看待,使得赋值时编译器会协助我们检查类型匹配
 * 和取值时 自动类转换
 * @author QAIU
 *
 */


public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		/*
		 * boolean add(E e)
		 * 指定泛型后编译器会检查传入的类型是否和传入的
		 * 类型匹配不匹配就报错
		 */
        c.add("one");
        c.add("two");
        c.add("tree");
        c.add("four");
        /*
         * 在新循环中定义接收元素值的变量时也
         * 可以使用元素的实际类型了
         * 编译器会在编译期间做造型操作
         */
        for (String str:c) {
        	System.out.println(str);
        }
        
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
        	//编译器在编译时候会补上
        	//String string = (String)iterator.next();

			String string = iterator.next();
			System.out.println(string);
		}
	}
}
