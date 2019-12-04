package top.qaiu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7_Map {
	public static void main(String[] args) {
		//Map存放的数据是无序的
		Map map = new HashMap();
		map.put("name", "韩梅梅");
		map.put("address","中国人");
		System.out.println(map);
		map.put("name", "李雷");
		map.put("age",20);
		System.out.println(map);
		//当key重复是value会被覆盖
		
		System.out.println(map.containsKey("name"));
		System.out.println(map.containsValue("20"));
		System.out.println(map.get("name"));
		System.out.println(map.remove("address"));
		System.out.println(map.values());
//		System.out.println(map.keySet());
//		System.out.println(map.entrySet());
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			Object value = map.get(key);
			System.out.println(key+"="+value);
		}
		
		Set set2 = map.entrySet();
		Iterator it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry key = (Entry) it2.next();
			Object o = key.getKey();
			System.out.println(key);
		}
		
	}
}
