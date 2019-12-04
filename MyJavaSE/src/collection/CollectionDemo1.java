package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection�����м��ϵĶ����ӿ�
 * ���涨�������м��϶�Ӧ�ö���Ĺ���
 * 
 * ����������һ�� ���Ա���һ��Ԫ�� 
 * ���ṩ����Ӧ�Ĳ������� ʹ�ø�����
 * 
 * Collection�����������������õ��ӽӿ�
 * java.util.List
 * ���Ա���Դ���ظ�Ԫ�� ��������
 * java.util.Set: �����ظ�����
 * Ԫ���Ƿ��ظ�������Ԫ�������equals�ȽϽ������
 * @author QAIU
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(T t)
		 * �򼯺����ָ��Ԫ�� �ɹ����� true
		 */
		c.add("���");
		c.add("����");

		c.add(0);
		c.add("���");
		
		System.out.println(c.toString());
		/*
		 * int size()
		 * ���ص�ǰ����Ԫ�صĸ���
		 */
		System.out.println(c.size());
		
		/*
		 * boolean isEmpty
		 * �жϵ�ǰ�����Ƿ�Ϊ�ռ�
		 */
		System.out.println(c.isEmpty());
		/*
		 * void clear 
		 * ��ռ���
		 */
		c.clear();
		System.out.println("��ռ���");
		
		System.out.println(c);
		System.out.println("size:"+c.size());
		System.out.println("�ռ�:"+c.isEmpty());
	}
}
