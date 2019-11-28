package day14;

import java.util.LinkedList;

public class Test3 {
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<>();
		Producer p = new Producer(list);
		Consumer c = new Consumer(list);
		p.start();
		c.start();
		
		while(true) {
			synchronized (list) {
				list.notifyAll();
			}
		}
	}
}
