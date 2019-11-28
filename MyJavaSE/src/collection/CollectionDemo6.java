package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����: JDK5֮���Ƴ���һ��������
 * ����Ҳ��Ϊ����������
 * ָ��������ʹ��ĳ����ʱ,ָ�������ĳ������,�����Ĳ����򷵻�ֵ����
 * ����������������
 * 
 * ���͵�ԭ����Object,ʵ���ϱ������ǽ�Object��������ָ��������
 * ����,ʹ�ø�ֵʱ��������Э�����Ǽ������ƥ��
 * ��ȡֵʱ �Զ���ת��
 * @author QAIU
 *
 */


public class CollectionDemo6 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		/*
		 * boolean add(E e)
		 * ָ�����ͺ���������鴫��������Ƿ�ʹ����
		 * ����ƥ�䲻ƥ��ͱ���
		 */
        c.add("one");
        c.add("two");
        c.add("tree");
        c.add("four");
        /*
         * ����ѭ���ж������Ԫ��ֵ�ı���ʱҲ
         * ����ʹ��Ԫ�ص�ʵ��������
         * ���������ڱ����ڼ������Ͳ���
         */
        for (String str:c) {
        	System.out.println(str);
        }
        
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
        	//�������ڱ���ʱ��Ჹ��
        	//String string = (String)iterator.next();

			String string = iterator.next();
			System.out.println(string);
		}
	}
}
