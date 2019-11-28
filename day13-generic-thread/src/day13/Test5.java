package day13;

import java.util.Deque;
import java.util.LinkedList;

public class Test5 {
	public static void main(String[] args) {
		Deque<String> q = new LinkedList<String>();
		System.out.println("--队列操作 先进先出(FIFO)------");
		q.offer("111");
		q.offer("222");
		q.offer("333");
		q.offer("444");
		q.offer("555");
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		q.push("aaa");
		q.push("bbb");
		q.push("ccc");
		q.push("ddd");
		q.push("eee");
		System.out.println(q);
		System.out.println(q.pop());
		System.out.println(q);
		System.out.println(q.pop());
		System.out.println(q);
		System.out.println(q.pop());
		System.out.println(q);
		System.out.println(q.pop());
		System.out.println(q);
//		q.
	}
}
