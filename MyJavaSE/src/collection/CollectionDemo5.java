package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection为所有集合提供了统一的遍历方式
 * 迭代器模式
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合元素的迭代器
 * 
 * Java.util.Iterator 迭代器接口
 * 
 * 不同的集合都提供了一个实现迭代器接口的迭代器
 * 实现类,并通过该方法返回以用于遍历当前集合元素
 * 
 * 使用迭代器遍历集合元素遵循3步:问,取,删
 * 其中删除元素不是必要操作
 * 
 * @author QAIU
 *
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		Collection <String>c = new ArrayList<>();
		c.add("#");
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		c.add("#");
		
		System.out.println(c);
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			if ("#".equals(s)) {
				/*
				 * 迭代器在遍历过程中不允许通过
				 * 集合方法增删元素,否则会抛出异常
				 */
				//c.remove(s);
				it.remove();
			}
		}
		System.out.println("c:"+c);
		
		
	}
}
