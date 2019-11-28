package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 栈结构
 * 栈可以保存一组元素,但是存取元素必须
 * 遵循先进后出的原则
 * 通常使用栈实现如"后退"这样的功能
 * @author QAIU
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		
		/*
		 * 双端队列为栈提供了对应的方法
		 * push和pop
		 * push等同于offerFirst
		 * pop等用于popFirst
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(9);
		vector.add(1);
		vector.add(2);
		
		System.out.println(vector);
	}
}
