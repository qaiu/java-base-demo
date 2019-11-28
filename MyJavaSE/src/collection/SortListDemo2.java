package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * sortLiseDemo1中的Collection的sort方法
 * 要求集合元素必须可以比较(实现Comparable接口)
 * 然后才能通过比较大小后按照从小到大排序
 * @author QAIU
 *
 */

public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(7, 8));
		list.add(new Point(5, 6));
		list.add(new Point(3, 4));
		list.add(new Point(1, 2));
		/*
		 * 这里编译不通过是因为
		 * point没有实现Comparator(比较器)接口
		 * 通常我们定义的类作为集合元素,并且
		 * 需要排序操作时,我们不直接继承接口
		 * 因为这对我们程序具有侵入性
		 * 
		 * 侵入性:当我们调用某个api时
		 * 要求我们除了调用方法这句代码之外
		 * 额外还需要修改代码时就具有了侵入性
		 * 修改越多,侵入性越强.
		 * 不利于代码维护 
		 */
//		Collections.sort(list);
		/*
		 * Collections的重载sort方法要求传入
		 * 要排序的List集合外还要一个参数 Comparator
		 * comparator比较器:一般我们使用匿名内部类实现
		 * 
		 * 使用此方法不在要求集合元素实现Comparator
		 * 此方法使用的场景
		 * 1:比较自定义元素(元素本身没有实现comparable接口)
		 * 2:额外的排序,这些元素已经实现了comparator接口
		 *   但不符合我们的排序需求时,我们也可以使用此方法
		 *   临时提供比较规则并排序
		 */
		Collections.sort(list,(o1,o2) -> {
			int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
			int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
			return len1 - len2;
		});
		
		System.out.println(list);
	}
}
