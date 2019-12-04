package thread;
/**
 * 线程提供了一个静态方法
 * Thread currentThread()
 * 该方法可以获取运行该方法的线程
 * 
 * Java中所有的方法都是靠线程运行的
 * main方法也不例外,运行main方法的线程被称为主线程
 * 也是我们程序的第一条线程
 * @author QAIU
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("运行dosome方法的线程"+t);
				dosome();
			};
		}.start();
	}

	static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("运行dosome方法的线程"+t);
	}
}
