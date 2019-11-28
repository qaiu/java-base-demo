package collection;

import java.util.ArrayList;
import java.util.List;
/**
 * java.util.List
 * 线性表,是Collection下面常见的接口,特点是
 * 可以存放重复元素,并且有序
 * 提供了一组通过下标查询的方法
 * 
 * 常见实现类
 * java.util.ArrayList:内部使用数组实现
 * 
 * Java.util.LinkedList增删元素效率好,尤其
 * 首尾增删元素性能最好,但查询性能若,对性能要求不是很苛刻的
 * 前提下通常用ArrayList
 * 
 * @author QAIU
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * E get(int index)
		 * 获取指定下标对应的元素
		 */
		System.out.println(list.get(1));
		/*
		 * 普通for循环可以遍历List结构
		 */
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		 * E set(int index,E element)
		 * 将给定元素设置到指定位置,返回值是该位置原有的元素
		 */
		String old = list.set(1, "2");
		
		System.out.println(list);
		System.out.println(old);
		/*
		 * 再不建立新集合的前提下
		 * 将List集合元素倒序
		 */
		
		for(int i = 0; i < list.size()/2; i++) {
			list.set(i,list.set(list.size()-i-1, list.get(i)));
		}
		System.out.println(list);
		
		
	}
}
