package thread;


/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ���ٽ���Դʱ,�����߳�
 * �л�ʱ����ȷ��,���²�������ִ��˳��δ�������
 * ��ͼִ�������µĲ�������,����ʱ���ܵ���ϵͳ̱��
 * 
 * �ٽ���Դ:ͬһʱ��ֻ����һ���̲߳�������Դ
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
	 * ��һ��������Synchronized�ؼ������κ�,
	 * �÷�������֮Ϊͬ������
	 * ��: ����̲߳���ͬʱ����������ڲ�����
	 * ������������Ϊͬ������������Ч������̵߳�
	 * ������ȫ������(������Ϊ�Ŷ�)
	 * 
	 * 
	 */
	public synchronized int getBean() {
		if (beans == 0) {
			throw new RuntimeException("���Ӳ���");
		}
		return beans--;
	}
}
