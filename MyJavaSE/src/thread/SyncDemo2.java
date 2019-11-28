package thread;
/**
 * 
 * ��Ч����Сͬ����Χ�����ڱ�֤��ȫ��ǰ���� ��߲���Ч��
 * 
 * ͬ����
 * 
 * synchronized(ͬ������������){
 *   ��Ҫ���еĴ����
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
	 * �ڷ�����ʹ��synchronizedʱ,����Ҫ����
	 * ָ������������ Ĭ��ʹ��this
	 */
	//public synchronized void buy()
	public void buy() {
		try {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+":"+"�������·�..");
			Thread.sleep(3000);
			/*
			 * ʹ��ͬ������Ը���ȷ��ִ����Ҫ�ŶӵĴ���Ƭ��
			 * ��ͬ����Ҫ�����ָ��ͬ������������,�ö����
			 * ����Java���е��κ�ʵ��
			 * ֻҪ��֤�����Ҫͬ��ִ��
			 * �Ĵ���Ƭ�ε��߳̿�������"ͬһ��"����
			 */
			synchronized (this) {
				System.out.println(thread.getName()+":"+"�������·�..");
				Thread.sleep(3000);				
			}
			System.out.println(thread.getName()+":"+"����..");
			
		}catch (Exception e) {
		}
	}
}
