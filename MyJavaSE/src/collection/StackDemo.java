package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * ջ�ṹ
 * ջ���Ա���һ��Ԫ��,���Ǵ�ȡԪ�ر���
 * ��ѭ�Ƚ������ԭ��
 * ͨ��ʹ��ջʵ����"����"�����Ĺ���
 * @author QAIU
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		
		/*
		 * ˫�˶���Ϊջ�ṩ�˶�Ӧ�ķ���
		 * push��pop
		 * push��ͬ��offerFirst
		 * pop������popFirst
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
