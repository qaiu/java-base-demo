package thread;

public class ThreadDemo01 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() { 
				for (int i = 0; i < 1000; i++) {
					System.out.println("��"+i+"��:Hello");
				}
			}
		});
		//ʹ��Lambda
		Thread thread2 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				System.out.println("��"+i+"��:Hi");
			}
		});
		thread1.start();
		thread2.start();
	}
}