package day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test2 {
	public static void main(String[] args) throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		C1 c = new C1();
		Future<Double> future = pool.submit(c);
		//可以执行其他任务
		Thread.sleep(5000);
		Double d = future.get();
		System.out.println("任务已经结束");
		System.out.println(d);
		pool.shutdown();
	}
	
	/*
	 * Callable和Runnable的区别
	 * 
	 * 		) 返回值
	 * 		) 异常
	 */
	static class C1 implements Callable<Double>{
		
		@Override
		public Double call() throws Exception {
			System.out.println("模拟耗时任务");
			Thread.sleep(3000);
			System.out.println("耗时任务结束");
			return Math.random();
		}
		
	}
}
