package top.qaiu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test9_Count {
	public static void main(String[] args) {
		//1.�����û�������ַ���
		String str = new Scanner(System.in).nextLine();
		Map map = new HashMap();
		//2.�����ַ���,����ȡÿ���ַ�
		for (int i = 0; i < str.length(); i++) {
			//3.�ַ���Ϊkey����map, value��Ҫ�ж�
			//4.�����±��ȡ��Ӧ���ַ�,���������map��Ϊkey
			char c = str.charAt(i);
			
			//5.�ж� ���value��Ĭ��ֵnull,�ʹ���1,����+1
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
