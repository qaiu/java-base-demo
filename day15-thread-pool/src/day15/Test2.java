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
		//����ִ����������
		Thread.sleep(5000);
		Double d = future.get();
		System.out.println("�����Ѿ�����");
		System.out.println(d);
		pool.shutdown();
	}
	
	/*
	 * Callable��Runnable������
	 * 
	 * 		) ����ֵ
	 * 		) �쳣
	 */
	static class C1 implements Callable<Double>{
		
		@Override
		public Double call() throws Exception {
			System.out.println("ģ���ʱ����");
			Thread.sleep(3000);
			System.out.println("��ʱ�������");
			return Math.random();
		}
		
	}
}
