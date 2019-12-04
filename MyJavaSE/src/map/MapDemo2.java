package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 88);
		System.out.println(map);
		/*
		 * 遍历key
		 * Set keySet()
		 * 将当前Map中的所有Key作为一个Set集合
		 * 形式返回,遍历每个Set元素即可
		 */
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key:"+key);
		}
		/*
		 * 遍历一组键值对
		 * Set entrySet()
		 * 将Map中的每一组键值对实例Entry,
		 * 存入Set集合并返回
		 * 
		 * Entry的每一个实例用于表示Map中的一组键值对
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
