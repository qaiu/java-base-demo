package day13;

public class Test6 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		t1.start();
		t2.start();
		System.out.println("main");
		Thread.currentThread().run();
		
	}
	static class T1 extends Thread{
		@Override
		public void run() {
			String n = getName();
			for (int i = 0; i < 3; i++) {
				System.out.println(n+":"+i);
			}
		}
	}
}
