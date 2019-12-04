package day15;


public class Test3 {
	static ThreadLocal<Double> threadLocal = new ThreadLocal<>();
	public static void main(String[] args) {
		
		new Thread() {
			@Override
			public void run() {
				a();
				b();
				c();
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				a();
				b();
				c();
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				a();
				b();
				c();
			}
		}.start();
	}
	
	static void a() {
		double d = getData();
		System.out.println(Thread.currentThread().getName()+": a() --- " + d);
	}
	static void b() {
		double d = getData();
		System.out.println(Thread.currentThread().getName()+": b() --- " + d);
	}
	static void c() {
		double d = getData();
		System.out.println(Thread.currentThread().getName()+": c() --- " + d);
	}

	private static double getData() {
		Double d = threadLocal.get();
		if (d == null) {
			d = Math.random();
			threadLocal.set(d);
		}
		return d;
	}
	
	private static void removeData() {
		threadLocal.remove();
	}
	
}
