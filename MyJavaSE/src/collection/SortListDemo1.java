package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


/**
 * java.util.Collections ���ϵĹ�����
 * ������һ�龲̬����,�������ǲ�������
 * ����sort���������List���Ͻ�����Ȼ�����
 * ��:��С����
 * @author QAIU
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(36));
		}
		System.out.println(list);
		
//		list.sort(null);
//		Collections.sort(list);
		
//		list.sort((a,b) -> b - a);
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		System.out.println(list);
	}
}
