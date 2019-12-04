package thread;
/**
 * 多线程
 * 多线程改变了代码的执行方式,从串行操作变为
 * 多段代码之间的并行操作
 * 
 * 由于cpu的物理特性,实际上多线程并非多段代码同时执行
 * 而是让这些代码片段齐头并进 走走停停
 * 造成感官上的 "同时" 
 * 这种执行方式称之为并发
 * 
 * 方式1: 继承Thread并重写run方法来定义线程任务
 * @author QAIU
 *
 */
public class ThreadDemo1 {
	
	public static void main(String[] args) {

		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
//		thread1.start();
//		thread2.start();
		new Thread() {public void run() {System.out.println("ok");};}.start();
	}
}
/**
 * 第一种创建线程的优点在于创建简单
 * 但是也存在缺点
 * 1:继承线程的同时重写run方法来定义线程任务
 * 这导致线程与任务存在必然的耦合关系
 * 不利于线程重用
 * 2:需要继承Thread类,这样无法继承其他类,去
 * 复用方法了,实际开发中很不方便
 * @author QAIU
 *
 */
class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hi:"+i);
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello:"+i);
		}
	}
}