package collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

/**
 * 双端队列
 * java.util.Deque接口,该接口是双端队列接口
 * 其继承自Queue.因此队列的相关方法他也具备.
 * 
 * 双端队列是队列两端都可以做出队入队操作的队列
 * 常用的实现类:java.util.LinkedList
 * @author QAIU
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		/*
		 * 从队首入队 
		 */
		deque.offerFirst("four");
		System.out.println(deque);
		/*
		 * 从队尾入队,与offer一致
		 */
		deque.offerLast("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		//从队首出队,和poll一致
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		//从队尾出队
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		
	}

}
