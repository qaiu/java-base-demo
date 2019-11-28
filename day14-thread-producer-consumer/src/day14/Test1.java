package day14;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test1 {
	static char[] a = {'*','*','*','*','*'};
	static char c = '-';
	static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {

				while (true) {
//					synchronized (a) {
					lock.writeLock().lock();;
						for (int i = 0; i < a.length; i++) {
							a[i] = c;
						}
					lock.writeLock().unlock();
						c = (c == '-'?'*':'-');
//					}
				}
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				while (true) {
//					synchronized (a) {
					lock.readLock().lock();
					System.out.println(Arrays.toString(a));
					lock.readLock().unlock();
//					}
				}
			};
		};
		t1.start();
		t2.start();
	}
}
