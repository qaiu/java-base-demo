package thread;
/**
 * 使用匿名内部类的方式创建线程
 * @author QAIU
 *
 */
public class ThreadDemo3 {
	static void demo1() {
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁呀?");
				}
			};
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("查水表的!");
				}
			};
		}).start();
	}
	
	static void demo2() {
		Thread t1 = new  Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁呀?");
				}
			}
		};
		
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("查水表的!");
				}
			}
		};
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		demo2();
	}
	
}
