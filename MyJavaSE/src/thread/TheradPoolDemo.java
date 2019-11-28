package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题
 * 1 线程的重用
 * 线程的生命周期不应得与任务的声明周期一致
 * 否则可能会出现线程的频繁创建于销毁,给系统带来不必要的开销\
 * 
 * 2:控制线程的数量
 * 一台计算机能承载的并发因素很多但是都是有一定的限度的
 * 超过就会内存溢出cpu过度切换 造成所有线程运行效率降低
 * @author QAIU
 *
 */
public class TheradPoolDemo {
	public static void main(String[] args) {
		//创建线程池 使用一个int值指定线程数量
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			Runnable r = () -> {
				try {
					Thread thread = Thread.currentThread();
					System.out.println(thread+"正在执行!");
					Thread.sleep(5000);
					System.out.println(thread+"执行完毕!");
				} catch (Exception e) {
				}
			};
			//把任务交给线程
			threadPool.execute(r);
			System.out.println("交给线程池跑一个任务");
			System.out.println("循环结束");
		}
		
		threadPool.shutdown();
		System.out.println("线性关闭了");
	}
	
}
