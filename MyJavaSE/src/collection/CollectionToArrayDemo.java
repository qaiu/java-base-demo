package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转为数组
 * Collection提供了一个方法toArray,可以将
 * 当前集合转为数组
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
//		Object array = c.toArray(); /不用
		/*
		 * 该toArray方法会将元素存入我们给定的数组并返回
		 * 如果我们给定的数组可用就用 不可用就自动创建一个数组
		 */
		String[] array = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
	}
}
