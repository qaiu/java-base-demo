package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����תΪ����
 * Collection�ṩ��һ������toArray,���Խ�
 * ��ǰ����תΪ����
 * @author QAIU
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		c.add("six");
		System.out.println(c);
//		Object array = c.toArray(); /����
		/*
		 * ��toArray�����ὫԪ�ش������Ǹ��������鲢����
		 * ������Ǹ�����������þ��� �����þ��Զ�����һ������
		 */
		String[] array = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
	}
}
