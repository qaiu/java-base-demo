package thread;
/**
 * ���߳�
 * ���̸߳ı��˴����ִ�з�ʽ,�Ӵ��в�����Ϊ
 * ��δ���֮��Ĳ��в���
 * 
 * ����cpu����������,ʵ���϶��̲߳��Ƕ�δ���ͬʱִ��
 * ��������Щ����Ƭ����ͷ���� ����ͣͣ
 * ��ɸй��ϵ� "ͬʱ" 
 * ����ִ�з�ʽ��֮Ϊ����
 * 
 * ��ʽ1: �̳�Thread����дrun�����������߳�����
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
 * ��һ�ִ����̵߳��ŵ����ڴ�����
 * ����Ҳ����ȱ��
 * 1:�̳��̵߳�ͬʱ��дrun�����������߳�����
 * �⵼���߳���������ڱ�Ȼ����Ϲ�ϵ
 * �������߳�����
 * 2:��Ҫ�̳�Thread��,�����޷��̳�������,ȥ
 * ���÷�����,ʵ�ʿ����кܲ�����
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