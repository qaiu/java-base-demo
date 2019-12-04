package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 * @author QAIU
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add("c");
		System.out.println("c1:"+c1);
		
		Collection c2 = new HashSet();
		c2.add("php");
		c2.add("c#");
		c2.add("java");
		System.out.println("c2:"+c2);
		
		/*
		 * boolean addAll()
		 * 将给定集合中的所有元素添加到当前集合
		 * 如果当前集合set集合则重复元素不会添加
		 */
		c1.addAll(c2);
		System.out.println("c2:"+c2);
		
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合的所有元素(交集)
		 */
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("c#");
		System.out.println("c3:"+c3);
		boolean contains = c2.containsAll(c3);
		System.out.println("全包含:"+contains);
		
		/*
		 * boolean removeAll(Collection c)
		 * 删除当前集合中与给定集合的共有元素
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		System.out.println("c3:"+c3);
		
		
	}
}
