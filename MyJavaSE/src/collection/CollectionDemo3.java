package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���Ͻ����ܴ����������Ԫ��,����ŵ���Ԫ�ص�����
 * ��ַ
 * �����Ż�����������Զ�ת��Ϊ��װ����б���
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
