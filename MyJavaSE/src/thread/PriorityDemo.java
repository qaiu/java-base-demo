package thread;
/**
 * 线程优先级
 * 线程有十个优先级,分别用1-10表示
 * 其中1为最低优先级,5是默认优先级,10是最高优先级
 * 优先级越高的线程获取cpu的时间片越多
 * @author QAIU
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread min = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("norm");
				}
			}
		};
		Thread max = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("max");
				}
			}
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();

	}
}
