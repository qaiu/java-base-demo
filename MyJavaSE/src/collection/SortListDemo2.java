package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * sortLiseDemo1�е�Collection��sort����
 * Ҫ�󼯺�Ԫ�ر�����ԱȽ�(ʵ��Comparable�ӿ�)
 * Ȼ�����ͨ���Ƚϴ�С���մ�С��������
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
		 * ������벻ͨ������Ϊ
		 * pointû��ʵ��Comparator(�Ƚ���)�ӿ�
		 * ͨ�����Ƕ��������Ϊ����Ԫ��,����
		 * ��Ҫ�������ʱ,���ǲ�ֱ�Ӽ̳нӿ�
		 * ��Ϊ������ǳ������������
		 * 
		 * ������:�����ǵ���ĳ��apiʱ
		 * Ҫ�����ǳ��˵��÷���������֮��
		 * ���⻹��Ҫ�޸Ĵ���ʱ�;�����������
		 * �޸�Խ��,������Խǿ.
		 * �����ڴ���ά�� 
		 */
//		Collections.sort(list);
		/*
		 * Collections������sort����Ҫ����
		 * Ҫ�����List�����⻹Ҫһ������ Comparator
		 * comparator�Ƚ���:һ������ʹ�������ڲ���ʵ��
		 * 
		 * ʹ�ô˷�������Ҫ�󼯺�Ԫ��ʵ��Comparator
		 * �˷���ʹ�õĳ���
		 * 1:�Ƚ��Զ���Ԫ��(Ԫ�ر���û��ʵ��comparable�ӿ�)
		 * 2:���������,��ЩԪ���Ѿ�ʵ����comparator�ӿ�
		 *   �����������ǵ���������ʱ,����Ҳ����ʹ�ô˷���
		 *   ��ʱ�ṩ�ȽϹ�������
		 */
		Collections.sort(list,(o1,o2) -> {
			int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
			int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
			return len1 - len2;
		});
		
		System.out.println(list);
	}
}
