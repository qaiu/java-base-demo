package thread;
/**
 * �ػ��߳�
 * �ػ��߳�Ҳ��Ϊ��̨�߳�,Ĭ�ϴ������̶߳�����ͨ�߳�
 * ͨ�����ÿ��Խ�һ���̱߳���ػ��߳�
 * 
 * �ػ��߳��ڴ�����ʹ��������ͨ�߳�û������
 * �����ڽ����߳�ʱ������һ������:���߳̽���
 * 
 * ��һ���߳��е�������ͨ�̶߳�����ʱ,���̾ͻ����,
 * ��ʱ�������������е��ػ��̶߳��ᱻǿ��ɱ��
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
				System.out.println(n + ":��ͨ!");
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
