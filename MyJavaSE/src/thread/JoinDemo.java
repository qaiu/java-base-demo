package thread;
/**
 * 线程提供了一个方法
 * void join()
 * 该方法允许调用此方法的线程阻塞
 * 直到该方法所属的线程结束时解除阻塞状态
 * 使用此方法可以协调线程间的同步运行
 * 
 * 同步运行:运行有先后顺序
 * 异步运行:各干各的,多线程并发本身就是异步运行
 * 
 * @author QAIU
 *
 */
public class JoinDemo {
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		Thread download = new Thread() {
			public void run() {
				for(int i = 1; i <= 100; i++) {
					System.out.println(i+"%");
					try {
						sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				isFinish = true;
				System.out.println("down:图片下载完毕");
			}
		};
		
		Thread show =new Thread() {
			@Override
			public void run() {
				System.out.println("show:开始下载文字:");
				try {
					sleep(3000);
					download.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				//等待图片下载
				if (!isFinish) {
					throw new RuntimeException("图片下载失败");
				}
				System.out.println("show:显示图片");
			}
		};
		
		
		show.start();
		download.start();
	}
}
