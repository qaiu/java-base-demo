package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ���ϵı���
 * CollectionΪ���м����ṩ��ͳһ�ı�����ʽ
 * ������ģʽ
 * Iterator iterator()
 * �÷������Ի�ȡһ�����ڱ�����ǰ����Ԫ�صĵ�����
 * 
 * Java.util.Iterator �������ӿ�
 * 
 * ��ͬ�ļ��϶��ṩ��һ��ʵ�ֵ������ӿڵĵ�����
 * ʵ����,��ͨ���÷������������ڱ�����ǰ����Ԫ��
 * 
 * ʹ�õ�������������Ԫ����ѭ3��:��,ȡ,ɾ
 * ����ɾ��Ԫ�ز��Ǳ�Ҫ����
 * 
 * @author QAIU
 *
 */
public class CollectionDemo5 {
	public static void main(String[] args) {
		Collection <String>c = new ArrayList<>();
		c.add("#");
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		c.add("#");
		
		System.out.println(c);
		Iterator it = c.iterator();
		
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			if ("#".equals(s)) {
				/*
				 * �������ڱ��������в�����ͨ��
				 * ���Ϸ�����ɾԪ��,������׳��쳣
				 */
				//c.remove(s);
				it.remove();
			}
		}
		System.out.println("c:"+c);
		
		
	}
}
