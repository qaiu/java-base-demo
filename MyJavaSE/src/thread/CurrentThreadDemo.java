package thread;
/**
 * �߳��ṩ��һ����̬����
 * Thread currentThread()
 * �÷������Ի�ȡ���и÷������߳�
 * 
 * Java�����еķ������ǿ��߳����е�
 * main����Ҳ������,����main�������̱߳���Ϊ���߳�
 * Ҳ�����ǳ���ĵ�һ���߳�
 * @author QAIU
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("����dosome�������߳�"+t);
				dosome();
			};
		}.start();
	}

	static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("����dosome�������߳�"+t);
	}
}
