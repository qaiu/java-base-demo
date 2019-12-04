package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素equals方法影响着元素的很多操作
 * 比如:几何是根据equals方法判断是否为重复元素
 * 还有如判断包含元素或删除元素也会使用
 * @author QAIU
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(1, 2));
		c.add(new Point(5, 6));
		c.add(new Point(7, 8));
		
		System.out.println(c);
		Point p = new Point(1, 2);
		/*
		 * boolean contains(Object o)
		 * 判断当前集合是否柏寒给定元素
		 */
		
		System.out.println("包含:"+c.contains(p));
		
		/*
		 * void remove()
		 * 删除指定元素
		 */
		c.remove(p);
		System.out.println(c);
		
	}
}
