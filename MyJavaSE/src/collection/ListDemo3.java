package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List提供了获取子集的操作
 * List subList(int start, int end)
 * 获取指定下标范围内的子集,含头不含尾
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		//获取3-7
		List<Integer> subList = list.subList(3, 8);
		System.out.println(list);
		System.out.println(subList);
		
		for(int i = 0; i<subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		/*
		 * 对子集的操作就是对原集合对应的操作
		 */
		System.out.println(list);
		System.out.println(subList);
		//删除2-8
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
