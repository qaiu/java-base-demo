package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//�������Լ��ϵ��÷�
public class Test5_Collection {
	public static void main(String[] args) {
		//1.�������϶���
		Collection c = new ArrayList();
		c.add(123);
		c.add("С��");
		c.add('a');
		c.add(true);
//		System.out.println(c);
//		System.out.println(c.hashCode());
//		System.out.println(c.isEmpty());
//		System.out.println(c.contains(123));
//		System.out.println(c.remove(true));
//		System.out.println(c.size());
//		System.out.println(c);
		
		//2.���÷���
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(c.isEmpty());
	}
}
