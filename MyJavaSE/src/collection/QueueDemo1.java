package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


/**
 * ����
 * �����Ǿ�������ݽṹ֮һ,���Ա���һ��Ԫ��
 * ����ȡԪ�ر�����ѭ�Ƚ��ȳ���ԭ��
 * java.util.Queue�ӿ�--���нӿ�
 * Queue�ӿڼ̳���Collection,��˼��ϵĻ�����������int result = values.stream()
  .filter(e -> e > 3)
  .filter(e -> e % 2 == 0)
  .map(e -> e * 2)
  .findFirst()
  .orElse(0);
 * Ҳ֧��
 * Queue�ĳ���ʵ����:java.util.LinkedList
 * @author QAIU
 *
 */
public class QueueDemo1 {
	public static void main(String[] args) {
		/*
		 * ����LinkedList������϶���ʹ�õ��������
		 * �����ΪQueue��ʵ����
		 */
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("tree");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		// ���Ӳ���,��ȡ��ɾ������Ԫ��
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		// ���ö���Ԫ��,����ɾ������
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
