package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ����Ĺ�����
 * java.util.Arrays
 * �ṩ�˾�̬����:asList
 * ���Խ���������תΪ����
 * @author QAIU
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {
				"one",
				"two",
				"three",
				"four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		
		int[] i = {1,3,5};
		List<int[]> arr = Arrays.asList(i);
		
		System.out.println();
		/*
		 * ��Ҫע�����
		 * ������ת�������ļ��� ����������
		 * ���Ƕ�ԭ����������
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		/*
		 * ���������Ƕ�����,��˶��������ɾ����֧��
		 * �����쳣
		 */
//		list.add("9");
//		System.out.println(list);
		/*
		 * ���м��϶�֧��һ������ΪCollection�Ĺ��췽��
		 * ������,�������ϵ�ͬʱ�������������ϵ�����Ԫ��
		 */
		
		List<String> list2 = new ArrayList<String>(list);
		System.out.println(list2);
		list2.add("five");
		System.out.println(list2);
		
	}
}
