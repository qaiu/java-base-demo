package day13;

public class Test7 {
	public static void main(String[] args) {
		Runnable r1 = ()-> {
			Thread t = Thread.currentThread();
			String n = t.getName();
			for (int i = 0; i < 1000; i++) {
				System.out.println(n+":"+i);
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);

		t1.start();
		t2.start();
		System.out.println("ok");
	}

}
