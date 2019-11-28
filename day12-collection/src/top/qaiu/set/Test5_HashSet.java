package top.qaiu.set;

import java.util.HashSet;
import java.util.Set;

public class Test5_HashSet {
	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add("5");
		hs.add(4);
		hs.add(3);
		hs.add("2");
		hs.add(1);
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.contains(4));
		System.out.println(hs.remove("5"));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs.isEmpty());
	}
}
