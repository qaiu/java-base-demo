package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了另一对通过下标操作元素的方法:
 * 重载的add,remove
 * @author QAIU
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * void add(int index, E element)
		 * 将指定元素插入到指定位置
		 */
		list.add(2, "2");
		System.out.println(list);
		/*
		 * E remove(int index)
		 * 删除指定下标对应的元素,并将其返回
		 */
		String s = list.remove(2);
		System.out.println(list);
		String s1 ="ab";
		String s2 ="abcd";     
		String s3="cd";		 
		String s4 =s1+s3;     
		s1=s4;    
		System.out.println("s1"+((s1==s2)?"==":"!=")+"s2");
		
	}
}
