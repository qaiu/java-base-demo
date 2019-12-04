package top.qaiu.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;


public class Test1_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		//元素都有索引可以通过索引位置添加元素
		list.add(2, 123);
		System.out.println(list.get(0));
		System.out.println(list.subList(1, 3));
		System.out.println(list);
		
		//迭代/遍历集合中的元素
		//使用Collection接口里提供的Iterator方法
		
		
		
		//使用List接口提供的ListIterator方法
		ListIterator it = list.listIterator(2);
		while(it.hasNext()) {
			System.out.println(it.previous());
			//it.add(2);
		}
		System.out.println(list);
	}
}
