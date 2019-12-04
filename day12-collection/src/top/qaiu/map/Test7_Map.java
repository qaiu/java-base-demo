package top.qaiu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7_Map {
	public static void main(String[] args) {
		//Map��ŵ������������
		Map map = new HashMap();
		map.put("name", "��÷÷");
		map.put("address","�й���");
		System.out.println(map);
		map.put("name", "����");
		map.put("age",20);
		System.out.println(map);
		//��key�ظ���value�ᱻ����
		
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
