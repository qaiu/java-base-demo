package top.qaiu.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//这个类测试Set接口的常用方法
public class Test4_Set {
	public static void main(String[] args) {
		//1.创建Set对象
		Set set = new HashSet();
		//2.调用常用方法
		set.add(5);
		set.add("大黄");
		set.add(3);
		set.add('a');
		set.add(1);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(5));
		System.out.println(set.toArray().length);
		//1.不能存放重复元素,2.元素是无序
		
		System.out.println(set.toString());
		//迭代Set集合
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
	}
}
