package top.qaiu.list;

import java.util.ArrayList;

public class Test2_ArrayList {
	public static void main(String[] args) {
		//1.创建ArrayList对象
		ArrayList al = new ArrayList();//默认集合大小是10
		al.add(12);
		al.add("中国");
		System.out.println(al);
		System.out.println(al.contains("a"));
		System.out.println(al.hashCode());
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf(12));
		System.out.println(">"+al);
		System.out.println(al.remove(0));
		System.out.println(al.set(0, "ok"));
		System.out.println(al);
		//2.测试常用方法
	}
}
