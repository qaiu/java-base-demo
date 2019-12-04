package top.qaiu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test8_HashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put("name", "Ð¡Ã÷");
		hm.put("age", 19);
		hm.put("gender", "Å®");
		hm.put("gender", "ÄÐ");
		
		System.out.println(hm);
		String s = (String)hm.get("name");
		System.out.println(s);
		
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry en = (Entry) it.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		hm.entrySet().forEach((o)->System.out.println(o));
		
	}

}
