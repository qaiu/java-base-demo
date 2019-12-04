package collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

/**
 * ˫�˶���
 * java.util.Deque�ӿ�,�ýӿ���˫�˶��нӿ�
 * ��̳���Queue.��˶��е���ط�����Ҳ�߱�.
 * 
 * ˫�˶����Ƕ������˶�������������Ӳ����Ķ���
 * ���õ�ʵ����:java.util.LinkedList
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
		 * �Ӷ������ 
		 */
		deque.offerFirst("four");
		System.out.println(deque);
		/*
		 * �Ӷ�β���,��offerһ��
		 */
		deque.offerLast("five");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		//�Ӷ��׳���,��pollһ��
		str = deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		//�Ӷ�β����
		str = deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
		
	}

}
