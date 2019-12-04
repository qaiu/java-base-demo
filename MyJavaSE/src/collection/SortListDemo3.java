package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序String
 * @author QAIU
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("苍老师");
		list.add("传奇");
		list.add("小泽老师");
		
		System.out.println(list);
		/*
		 * String 已经实现了Comparator接口
		 * 并定义了比较规则,按照字符的Unicode编码
		 * 大小排序
		 */
//		Collections.sort(list);
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s1.length()-s2.length();
//			}
//		});
		
		list.sort((s1,s2) -> s1.length() - s2.length());
		System.out.println(list);
		
	}
}
