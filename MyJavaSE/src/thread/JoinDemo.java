package thread;
/**
 * �߳��ṩ��һ������
 * void join()
 * �÷���������ô˷������߳�����
 * ֱ���÷����������߳̽���ʱ�������״̬
 * ʹ�ô˷�������Э���̼߳��ͬ������
 * 
 * ͬ������:�������Ⱥ�˳��
 * �첽����:���ɸ���,���̲߳�����������첽����
 * 
 * @author QAIU
 *
 */
public class JoinDemo {
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		Thread download = new Thread() {
			public void run() {
				for(int i = 1; i <= 100; i++) {
					System.out.println(i+"%");
					try {
						sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				isFinish = true;
				System.out.println("down:ͼƬ�������");
			}
		};
		
		Thread show =new Thread() {
			@Override
			public void run() {
				System.out.println("show:��ʼ��������:");
				try {
					sleep(3000);
					download.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				//�ȴ�ͼƬ����
				if (!isFinish) {
					throw new RuntimeException("ͼƬ����ʧ��");
				}
				System.out.println("show:��ʾͼƬ");
			}
		};
		
		
		show.start();
		download.start();
	}
}
