package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Ԫ��equals����Ӱ����Ԫ�صĺܶ����
 * ����:�����Ǹ���equals�����ж��Ƿ�Ϊ�ظ�Ԫ��
 * �������жϰ���Ԫ�ػ�ɾ��Ԫ��Ҳ��ʹ��
 * @author QAIU
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(1, 2));
		c.add(new Point(5, 6));
		c.add(new Point(7, 8));
		
		System.out.println(c);
		Point p = new Point(1, 2);
		/*
		 * boolean contains(Object o)
		 * �жϵ�ǰ�����Ƿ�غ�����Ԫ��
		 */
		
		System.out.println("����:"+c.contains(p));
		
		/*
		 * void remove()
		 * ɾ��ָ��Ԫ��
		 */
		c.remove(p);
		System.out.println(c);
		
	}
}
