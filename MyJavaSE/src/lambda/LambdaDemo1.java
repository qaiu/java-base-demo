package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


/**
 * lambda表达式
 * 函数式编程
 * 
 * 可以使用更简便的方式创建匿名内部类
 * 函数式接口(只有一个抽象方法)才能使用
 * @author QAIU
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Hello");
		List<String> list = new ArrayList<>();
		
	}
}
