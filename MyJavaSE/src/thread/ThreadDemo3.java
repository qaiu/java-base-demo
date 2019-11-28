package thread;
/**
 * ʹ�������ڲ���ķ�ʽ�����߳�
 * @author QAIU
 *
 */
public class ThreadDemo3 {
	static void demo1() {
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭ѽ?");
				}
			};
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("��ˮ���!");
				}
			};
		}).start();
	}
	
	static void demo2() {
		Thread t1 = new  Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("����˭ѽ?");
				}
			}
		};
		
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("��ˮ���!");
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
