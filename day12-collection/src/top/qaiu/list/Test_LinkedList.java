package top.qaiu.list;

import java.util.LinkedList;

//�������������LinkedList�ĳ��÷���
public class Test_LinkedList {
	public static void main(String[] args) {
		//����LinkedList����
		LinkedList<String> linked = new LinkedList<>();
		
		linked.add("С��");
		linked.add("С��");
		
		
		linked.offer("С��");//==offerLast
		linked.offerFirst("С��");//==push
		//���÷���
		System.out.println(linked);
	}
}
