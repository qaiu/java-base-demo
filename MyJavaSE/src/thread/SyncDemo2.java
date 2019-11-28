package thread;
/**
 * 
 * 有效的缩小同步范围可以在保证安全的前提下 提高并发效率
 * 
 * 同步块
 * 
 * synchronized(同步监视器对象){
 *   需要运行的代码块
 * }
 * @author QAIU
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop=new Shop();
		Thread t1 = new Thread(){
			@Override
			public void run() {
				shop.buy();
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run() {
				shop.buy();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Shop{
	/**
	 * 在方法上使用synchronized时,不需要单独
	 * 指定监视器对象 默认使用this
	 */
	//public synchronized void buy()
	public void buy() {
		try {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+":"+"正在挑衣服..");
			Thread.sleep(3000);
			/*
			 * 使用同步块可以更精确的执行需要排队的代码片段
			 * 但同步块要求必须指定同步监视器对象,该对象可
			 * 以是Java类中的任何实例
			 * 只要保证多个需要同步执行
			 * 的代码片段的线程看到的是"同一个"即可
			 */
			synchronized (this) {
				System.out.println(thread.getName()+":"+"正在试衣服..");
				Thread.sleep(3000);				
			}
			System.out.println(thread.getName()+":"+"结账..");
			
		}catch (Exception e) {
		}
	}
}
