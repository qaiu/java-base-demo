package top.qaiu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test9_Count {
	public static void main(String[] args) {
		//1.接受用户输入的字符串
		String str = new Scanner(System.in).nextLine();
		Map map = new HashMap();
		//2.遍历字符串,并获取每个字符
		for (int i = 0; i < str.length(); i++) {
			//3.字符作为key存入map, value需要判断
			//4.根据下标获取对应的字符,即将存入的map作为key
			char c = str.charAt(i);
			
			//5.判断 如果value是默认值null,就存入1,否则+1
			Integer sum = (Integer)map.get(c);
			if (sum == null) {
				map.put(c, 1);
			} else {
				map.put(c, sum+1);
			}
		}
//		map.entrySet().forEach((o) -> System.out.println(o.getClass()));
		Set set = map.entrySet();
		
		
	}
}
