package day14;

import java.util.Queue;

public class Consumer extends Thread{
	private Queue<Character> q; //��Ϣ����

	/**
	 * @param q
	 */
	public Consumer(Queue<Character> q) {
		this.q = q;
	}
	@Override
	public void run() {
		while (true) {
			//��ͷ���Ƴ�����,����ǿռ��ϵõ�nullֵ list.removeFirst��ռ����쳣
			synchronized (q) {
				while (q.isEmpty()) {//��ѭ��Ϊ��ʱ
					try {
						q.wait(); //������ǰ�߳�
					} catch (Exception e) {
					}
				}
				Character c = q.poll();
				System.out.println(">>> " + c);
			}
		}
	}
}
