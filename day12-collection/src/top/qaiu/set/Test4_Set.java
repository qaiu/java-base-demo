package top.qaiu.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//��������Set�ӿڵĳ��÷���
public class Test4_Set {
	public static void main(String[] args) {
		//1.����Set����
		Set set = new HashSet();
		//2.���ó��÷���
		set.add(5);
		set.add("���");
		set.add(3);
		set.add('a');
		set.add(1);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(5));
		System.out.println(set.toArray().length);
		//1.���ܴ���ظ�Ԫ��,2.Ԫ��������
		
		System.out.println(set.toString());
		//����Set����
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
	}
}
