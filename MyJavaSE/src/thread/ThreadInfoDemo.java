package thread;
/**
 * 获取线程的相关信息
 * @author QAIU
 *
 */
public class ThreadInfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		
		//获取线程名字
		String name = main.getName();
		System.out.println(name);
		//获取唯一标识
		long id = main.getId();
		System.out.println(id);
		//获取优先级
		int pri = main.getPriority();
		System.out.println(pri);
		
		//线程是否活着
		System.out.println("线程是否活着"+main.isAlive());
		//线程是否为守护线程
		System.out.println("线程是否是守护线程"+main.isDaemon());
		//线程是否被中断
		System.out.println("是否被中断"+main.isInterrupted());
		
	}
}
