package thread;
/**
 * 互斥锁
 * 当使用synchronized 锁定多个
 * 代码片段并且指定的都是同一个监视器对象时
 * 这些代码片段是互斥的
 * 多线程不能同时在做这些代码片段里运行
 * @author QAIU
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		Boo boo=new Boo();
		
		Thread t1 = new Thread() {
			public void run() {
				boo.methodA();
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				boo.methodB();
			};
		};
		t1.start();
		t2.start();
	}
	
	
}

class Boo{
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":methodA执行了..");
			Thread.sleep(2000);
			System.out.println(t.getName()+":methodA执行完了..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	public synchronized void methodB() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":methodB执行了..");
			Thread.sleep(2000);
			System.out.println(t.getName()+":methodB执行完了..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}