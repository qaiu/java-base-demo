package thread;

import java.util.Scanner;

/**
 * Sleep阻塞
 * 
 * 线程提供了一个静态方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态
 * 指定毫秒,超过这个时间线程会自动回到RUNNABLE状态
 * 等待再次分配时间片并发运行.
 * 
 * @author QAIU
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		/*
		 * 在控制台输入一个数字,然后从该数字
		 * 开始每秒递减,到0的时候输出时间到
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		System.out.println("时间到");
	}
}
