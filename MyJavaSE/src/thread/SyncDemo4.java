package thread;
/**
 * ������
 * ��ʹ��synchronized �������
 * ����Ƭ�β���ָ���Ķ���ͬһ������������ʱ
 * ��Щ����Ƭ���ǻ����
 * ���̲߳���ͬʱ������Щ����Ƭ��������
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
			System.out.println(t.getName()+":methodAִ����..");
			Thread.sleep(2000);
			System.out.println(t.getName()+":methodAִ������..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	public synchronized void methodB() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":methodBִ����..");
			Thread.sleep(2000);
			System.out.println(t.getName()+":methodBִ������..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}