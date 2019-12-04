package oopday03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
	        System.out.println("ArrayList集合初始化容量："+list.size());

	        //添加功能：
	        list.add("Hello");
	        list.add("world");
	        list.add(2,"!");
	        System.out.println("ArrayList当前容量："+list.size());

	        //修改功能：
	        list.set(0,"my");
	        list.set(1,"name");
	        System.out.println("ArrayList当前内容："+list.toString());

	        //获取功能：
	        String element = list.get(0);
	        System.out.println(element);

	        //迭代器遍历集合：(ArrayList实际的跌倒器是Itr对象)
	        Iterator<String> iterator =  list.iterator();
	        while(iterator.hasNext()){
	            String next = iterator.next();
	            System.out.println(next);
	        }

	        //for循环迭代集合：
	        for(String str:list){
	            System.out.println(str);
	        }

	        //判断功能：
	        boolean isEmpty = list.isEmpty();
	        boolean isContain = list.contains("my");

	        //长度功能：
	        int size = list.size();

	        //把集合转换成数组：
	        String[] strArray = list.toArray(new String[]{});

	        //删除功能：
	        list.remove(0);
	        list.remove("world");
	        list.clear();
	        System.out.println("ArrayList当前容量："+list.size());
	}
}
