package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//创建一个固定数量的线程池
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		R1 r = new R1();
		//任务丢进线程池,并得到一个取餐凭证
		Future<?> future = pool.submit(r);
		//不必等线程结束,可以先执行其他运算
		//1....2....3....4....5....
		//执行其他运算,用取餐凭证来等待
		future.get();
		System.out.println("线程执行完毕");
	}
	
	static class R1 implements Runnable{
		
		@Override
		public void run() {
			System.out.println("模拟一个耗时任务");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}
	
}
