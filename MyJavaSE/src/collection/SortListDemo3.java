package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ����String
 * @author QAIU
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����ʦ");
		list.add("����");
		list.add("С����ʦ");
		
		System.out.println(list);
		/*
		 * String �Ѿ�ʵ����Comparator�ӿ�
		 * �������˱ȽϹ���,�����ַ���Unicode����
		 * ��С����
		 */
//		Collections.sort(list);
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s1.length()-s2.length();
//			}
//		});
		
		list.sort((s1,s2) -> s1.length() - s2.length());
		System.out.println(list);
		
	}
}
