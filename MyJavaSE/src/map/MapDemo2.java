package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 88);
		System.out.println(map);
		/*
		 * ����key
		 * Set keySet()
		 * ����ǰMap�е�����Key��Ϊһ��Set����
		 * ��ʽ����,����ÿ��SetԪ�ؼ���
		 */
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
		}
		/*
		 * ����һ���ֵ��
		 * Set entrySet()
		 * ��Map�е�ÿһ���ֵ��ʵ��Entry,
		 * ����Set���ϲ�����
		 * 
		 * Entry��ÿһ��ʵ�����ڱ�ʾMap�е�һ���ֵ��
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
//		map.forEach();
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println("value:"+value);
		}
		
		map.entrySet().forEach(System.out::println);
	}
}
