package day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
	public static void main(String[] args) {
		ExecutorService pool = null;
//		pool = Executors.newFixedThreadPool(5);
		pool = Executors.newCachedThreadPool();
//		pool = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 1000; i++) {
			R1 r = new R1(i);
			pool.execute(r);
		}
//		pool.shutdown();
	}
	
	static class R1 implements Runnable{
		int id;
		
		/**
		 * @param id
		 */
		public R1(int id) {
			this.id = id;
		}
		

		@Override
		public void run() {
			String n = Thread.currentThread().getName();
			System.out.println(n+" - "+id);
		}
	}
}
