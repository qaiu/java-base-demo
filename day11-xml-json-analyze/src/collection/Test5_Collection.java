package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//这个类测试集合的用法
public class Test5_Collection {
	public static void main(String[] args) {
		//1.创建集合对象
		Collection c = new ArrayList();
		c.add(123);
		c.add("小明");
		c.add('a');
		c.add(true);
//		System.out.println(c);
//		System.out.println(c.hashCode());
//		System.out.println(c.isEmpty());
//		System.out.println(c.contains(123));
//		System.out.println(c.remove(true));
//		System.out.println(c.size());
//		System.out.println(c);
		
		//2.常用方法
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		
		System.out.println(c.isEmpty());
	}
}
