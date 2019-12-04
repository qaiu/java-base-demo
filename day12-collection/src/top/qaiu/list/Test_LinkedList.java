package top.qaiu.list;

import java.util.LinkedList;

//这个类用来测试LinkedList的常用方法
public class Test_LinkedList {
	public static void main(String[] args) {
		//创建LinkedList对象
		LinkedList<String> linked = new LinkedList<>();
		
		linked.add("小明");
		linked.add("小黑");
		
		
		linked.offer("小红");//==offerLast
		linked.offerFirst("小王");//==push
		//常用方法
		System.out.println(linked);
	}
}
