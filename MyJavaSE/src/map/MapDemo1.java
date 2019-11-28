package map;

import java.util.HashMap;
import java.util.Map;


/**
 * java.util.Map接口
 * 查找表
 * Map体现的结构是一个多行两列的表格,左列成为Key
 * 右边成为Value
 * Map总是根据key获取对应的Value
 * 因此保存数据时是成对保存的
 * 并且查询的时候应当将查询数据作为Value
 * 查询条件作为key保存
 * map要求key不能重复(equals比较判定)
 * 
 * 常用的实现类
 * java.util.HashMap,散列表
 * 当今查询速度最快的数据结构
 * @author QAIU
 *
 */
public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		/*
		 * V put(K k,V v)
		 * 将给定的Key-Value放入Map
		 * 由于Key不允许重复,所以
		 * 若使用重复的Key存储则是替换对应的Value操作
		 * 那么返回值就是Key原来对应的Value
		 * 若给定的Key不存在则返回null
		 */
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		Integer value = map.put("化学", 99);
		System.out.println(value);
		System.out.println(map);
		value = map.put("化学", 98);
		System.out.println(value);
		System.out.println(map);
		value = map.get("数学");
		System.out.println("数学:"+value);
		/*
		 * V remove(Object key)
		 * 删除Map里给的的Key对应的键值对
		 * 返回值是Key对应的Value
		 * 如果不存在返回null
		 */
		value = map.remove("数学");
		System.out.println(value);
		System.out.println(map);
		value = map.remove("数");
		System.out.println(value);
		System.out.println(map);
		
		/*
		 * int size()
		 * 返回Map元素个数
		 */
		int size = map.size();
		System.out.println(size);
		/*
		 * 判断当前Map是否包含给定的Key或Value
		 */
		boolean ck = map.containsKey("语文");
		System.out.println("包含Key:"+ck);
		boolean cv = map.containsValue(97);
		System.out.println("包含Value:"+cv);
		
//		map.forEach(null);
		/*
		 * Map的遍历
		 * Map提供了三种遍历方法
		 * 1:遍历所有的Key
		 * 2:遍历一组键值对
		 * 3:遍历所有Value(不常用)
		 * 
		 */
	}
}
