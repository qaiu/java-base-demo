package thread;
/**
 * �߳����ȼ�
 * �߳���ʮ�����ȼ�,�ֱ���1-10��ʾ
 * ����1Ϊ������ȼ�,5��Ĭ�����ȼ�,10��������ȼ�
 * ���ȼ�Խ�ߵ��̻߳�ȡcpu��ʱ��ƬԽ��
 * @author QAIU
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread min = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("min");
				}
			}
		};
		Thread norm = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("norm");
				}
			}
		};
		Thread max = new Thread() {
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.println("max");
				}
			}
		};
		
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();

	}
}
