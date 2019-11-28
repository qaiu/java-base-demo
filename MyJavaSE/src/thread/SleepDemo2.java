package thread;
/**
 * sleep方法要求我们处理中断异常
 * 当一个线程调用sleep方法处于阻塞的过程
 * 中 这个线程的interrupt方法被调用时,此时sleep
 * 方法就会抛出中断异常来强制打断睡眠阻塞
 * @author QAIU
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread() {
			public void run() {
				System.out.println("林:刚美完容,睡一会");
				try {
					sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林:干嘛呢!干嘛呢!都破了相了!");
				}
				System.out.println("醒了");
			}
		};
		
		lin.start();
		new Thread() {
			public void run() {
				System.out.println("黄:开始砸墙");

				for(int i = 0; i<5; i++) {
					try {
						sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("黄:八十,八十!");
				}
				System.out.println("黄:大哥,搞定");
				lin.interrupt();
			}
		}.start();

	}

}
