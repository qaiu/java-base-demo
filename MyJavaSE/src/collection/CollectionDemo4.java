package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϲ���
 * @author QAIU
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add("c");
		System.out.println("c1:"+c1);
		
		Collection c2 = new HashSet();
		c2.add("php");
		c2.add("c#");
		c2.add("java");
		System.out.println("c2:"+c2);
		
		/*
		 * boolean addAll()
		 * �����������е�����Ԫ����ӵ���ǰ����
		 * �����ǰ����set�������ظ�Ԫ�ز������
		 */
		c1.addAll(c2);
		System.out.println("c2:"+c2);
		
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�����������ϵ�����Ԫ��(����)
		 */
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("c#");
		System.out.println("c3:"+c3);
		boolean contains = c2.containsAll(c3);
		System.out.println("ȫ����:"+contains);
		
		/*
		 * boolean removeAll(Collection c)
		 * ɾ����ǰ��������������ϵĹ���Ԫ��
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		System.out.println("c3:"+c3);
		
		
	}
}
