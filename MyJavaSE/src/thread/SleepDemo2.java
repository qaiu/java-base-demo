package thread;
/**
 * sleep����Ҫ�����Ǵ����ж��쳣
 * ��һ���̵߳���sleep�������������Ĺ���
 * �� ����̵߳�interrupt����������ʱ,��ʱsleep
 * �����ͻ��׳��ж��쳣��ǿ�ƴ��˯������
 * @author QAIU
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		Thread lin = new Thread() {
			public void run() {
				System.out.println("��:��������,˯һ��");
				try {
					sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("��:������!������!����������!");
				}
				System.out.println("����");
			}
		};
		
		lin.start();
		new Thread() {
			public void run() {
				System.out.println("��:��ʼ��ǽ");

				for(int i = 0; i<5; i++) {
					try {
						sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("��:��ʮ,��ʮ!");
				}
				System.out.println("��:���,�㶨");
				lin.interrupt();
			}
		}.start();

	}

}
