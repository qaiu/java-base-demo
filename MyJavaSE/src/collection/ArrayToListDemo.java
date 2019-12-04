package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类
 * java.util.Arrays
 * 提供了静态方法:asList
 * 可以将给定数组转为集合
 * @author QAIU
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {
				"one",
				"two",
				"three",
				"four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		
		int[] i = {1,3,5};
		List<int[]> arr = Arrays.asList(i);
		
		System.out.println();
		/*
		 * 需要注意的是
		 * 从数组转换出来的集合 对其做操作
		 * 就是对原数组做操作
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		/*
		 * 由于数组是定长的,因此对数组的增删都不支持
		 * 会抛异常
		 */
//		list.add("9");
//		System.out.println(list);
		/*
		 * 所有集合都支持一个参数为Collection的构造方法
		 * 作用是,创建集合的同时包含进给定集合的所有元素
		 */
		
		List<String> list2 = new ArrayList<String>(list);
		System.out.println(list2);
		list2.add("five");
		System.out.println(list2);
		
	}
}
