package thread;


/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一个临界资源时,由于线程
 * 切换时机不确定,导致操作代码执行顺序未按照设计
 * 意图执行所导致的操作混乱,严重时可能导致系统瘫痪
 * 
 * 临界资源:同一时间只允许一天线程操作的资源
 * @author QAIU
 *
 */
public class SyncDemo {
	public static void main(String[] args) {

		Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);}
			}
		};

		
		t1.start();
		t2.start();
	}
}

class Table{
	private int beans = 20;
	/**
	 * 当一个方法被Synchronized关键字修饰后,
	 * 该方法被称之为同步方法
	 * 即: 多个线程不能同时在这个方法内部运行
	 * 将并发操作改为同步操作就能有效解决多线程的
	 * 并发安全问题了(把抢改为排队)
	 * 
	 * 
	 */
	public synchronized int getBean() {
		if (beans == 0) {
			throw new RuntimeException("豆子不足");
		}
		return beans--;
	}
}
