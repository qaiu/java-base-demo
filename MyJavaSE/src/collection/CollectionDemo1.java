package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection是所有集合的顶级接口
 * 里面定义了所有集合都应该定义的功能
 * 
 * 几何与数组一样 可以保存一组元素 
 * 并提供了相应的操作方法 使用更方便
 * 
 * Collection下面派生了两个常用的子接口
 * java.util.List
 * 线性表可以存放重复元素 并且有序
 * java.util.Set: 不可重复集合
 * 元素是否重复是依靠元素自身的equals比较结果而定
 * @author QAIU
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(T t)
		 * 向集合添加指定元素 成功返回 true
		 */
		c.add("你好");
		c.add("世界");

		c.add(0);
		c.add("你好");
		
		System.out.println(c.toString());
		/*
		 * int size()
		 * 返回当前集合元素的个数
		 */
		System.out.println(c.size());
		
		/*
		 * boolean isEmpty
		 * 判断当前集合是否为空集
		 */
		System.out.println(c.isEmpty());
		/*
		 * void clear 
		 * 清空集合
		 */
		c.clear();
		System.out.println("清空集合");
		
		System.out.println(c);
		System.out.println("size:"+c.size());
		System.out.println("空集:"+c.isEmpty());
	}
}
