package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 队列
 * 队列是经典的数据结构之一,可以保存一组元素
 * 但存取元素必须遵循先进先出的原则
 * java.util.Queue接口--队列接口
 * Queue接口继承自Collection,因此集合的基本方法队列int result = values.stream()
  .filter(e -> e > 3)
  .filter(e -> e % 2 == 0)
  .map(e -> e * 2)
  .findFirst()
  .orElse(0);
 * 也支持
 * Queue的常用实现类:java.util.LinkedList
 * @author QAIU
 *
 */
public class QueueDemo1 {
	public static void main(String[] args) {
		/*
		 * 由于LinkedList链表符合队列使用的相关特性
		 * 因此作为Queue的实现类
		 */
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("tree");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		// 出队操作,获取并删除队首元素
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		// 引用队首元素,不做删除操作
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		System.out.println(queue.size());
	
		System.out.println(queue.size());
		
		for (Iterator<String> iterator = queue.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if ("four".equals(string)) {
				iterator.remove();
			}
		}
		
//		queue.forEach(s->{
//			s=queue.poll();
//			System.out.println(s);
//		});
		System.out.println(queue.size());
		System.out.println(queue);
	}
}
