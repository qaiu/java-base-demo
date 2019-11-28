package thread;
/**
 * 静态方法使用synchronized后,该方法一定具有同步效果
 * 静态方法指定的锁对象为当前类的类对象(Class的实例,后面反射知识点会介绍它)
 * 每个被JVM加载的类都有且只有一个Class实例,因此
 * 静态方法锁对象就一定具有同步效果
 * @author QAIU
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Foo{
//	public synchronized static void dosome() {
	public static void dosome() {
		/*
		 * 静态方法中使用同步块时,指定同步监视器对象
		 * 依然选区当前类的类对象
		 * 获取方法 类名.class
		 */
		synchronized (Foo.class) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+"开始执行");
				Thread.sleep(1000);
				System.out.println(t.getName()+"完毕");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
