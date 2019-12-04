package day14;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{
	private Queue<Character> q; //消息队列

	/**
	 * @param q
	 */
	public Producer(Queue<Character> q) {
		this.q = q;
	}
	@Override
	public void run() {
		while (true) {
			char c = (char) ('a'+new Random().nextInt(26));//[0,26)

			synchronized (q) {
				q.offer(c);
				System.out.println("<<< "+c);
				q.notifyAll();
			}
		}
	}

}
