package day14;

import java.util.Queue;

public class Consumer extends Thread{
	private Queue<Character> q; //消息队列

	/**
	 * @param q
	 */
	public Consumer(Queue<Character> q) {
		this.q = q;
	}
	@Override
	public void run() {
		while (true) {
			//从头部移出数据,如果是空集合得到null值 list.removeFirst会空集合异常
			synchronized (q) {
				while (q.isEmpty()) {//当循环为空时
					try {
						q.wait(); //阻塞当前线程
					} catch (Exception e) {
					}
				}
				Character c = q.poll();
				System.out.println(">>> " + c);
			}
		}
	}
}
