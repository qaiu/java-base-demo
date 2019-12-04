package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List�ṩ�˻�ȡ�Ӽ��Ĳ���
 * List subList(int start, int end)
 * ��ȡָ���±귶Χ�ڵ��Ӽ�,��ͷ����β
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		//��ȡ3-7
		List<Integer> subList = list.subList(3, 8);
		System.out.println(list);
		System.out.println(subList);
		
		for(int i = 0; i<subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		/*
		 * ���Ӽ��Ĳ������Ƕ�ԭ���϶�Ӧ�Ĳ���
		 */
		System.out.println(list);
		System.out.println(subList);
		//ɾ��2-8
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}
