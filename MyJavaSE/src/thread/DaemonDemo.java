package thread;
/**
 * 守护线程
 * 守护线程也称为后台线程,默认创建的线程都是普通线程
 * 通过设置可以将一个线程变成守护线程
 * 
 * 守护线程在创建与使用上与普通线程没有区别
 * 但是在结束线程时机上有一个区别:即线程结束
 * 
 * 当一个线程中的所有普通线程都结束时,进程就会结束,
 * 此时进程中所有运行的守护线程都会被强制杀死
 * 
 * @author QAIU
 *
 */
public class DaemonDemo {
	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				Thread.currentThread().setName("Rose");
				String n = Thread.currentThread().getName();
				for(int i = 0; i<5; i++) {
					System.out.println(n + ":Let me go!");
					try {
						sleep(1000);
					} catch (Exception e) {
					}
				}
				System.out.println(n + ":aaaaaaaaa!~~~");
				System.out.println(n + ":噗通!");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				Thread.currentThread().setName("Jeck");
				String n = Thread.currentThread().getName();
				while(true) {
					System.out.println(n + ":you jump,my jump!");
					try {
						sleep(1000);
					} catch (Exception e) {
						System.out.println("123");
					}
				}
			};
		};
		jack.setDaemon(true);
		rose.start();
		jack.start();
	}

}
