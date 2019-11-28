package collection;

import java.util.ArrayList;
import java.util.List;
/**
 * java.util.List
 * ���Ա�,��Collection���泣���Ľӿ�,�ص���
 * ���Դ���ظ�Ԫ��,��������
 * �ṩ��һ��ͨ���±��ѯ�ķ���
 * 
 * ����ʵ����
 * java.util.ArrayList:�ڲ�ʹ������ʵ��
 * 
 * Java.util.LinkedList��ɾԪ��Ч�ʺ�,����
 * ��β��ɾԪ���������,����ѯ������,������Ҫ���Ǻܿ��̵�
 * ǰ����ͨ����ArrayList
 * 
 * @author QAIU
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * E get(int index)
		 * ��ȡָ���±��Ӧ��Ԫ��
		 */
		System.out.println(list.get(1));
		/*
		 * ��ͨforѭ�����Ա���List�ṹ
		 */
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		 * E set(int index,E element)
		 * ������Ԫ�����õ�ָ��λ��,����ֵ�Ǹ�λ��ԭ�е�Ԫ��
		 */
		String old = list.set(1, "2");
		
		System.out.println(list);
		System.out.println(old);
		/*
		 * �ٲ������¼��ϵ�ǰ����
		 * ��List����Ԫ�ص���
		 */
		
		for(int i = 0; i < list.size()/2; i++) {
			list.set(i,list.set(list.size()-i-1, list.get(i)));
		}
		System.out.println(list);
		
		
	}
}
