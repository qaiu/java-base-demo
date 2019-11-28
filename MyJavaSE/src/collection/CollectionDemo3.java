package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合仅仅能存放引用类型元素,并存放的是元素的引用
 * 地址
 * 如果存放基本类型则会自动转换为包装类就行保存
 * 
 * @author QAIU
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Point p = new Point(1, 3);
		c.add(p);
		c.add(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		p.setX(2);
		c.remove(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		
	}

}
