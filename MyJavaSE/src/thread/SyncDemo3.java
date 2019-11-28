package thread;
/**
 * ��̬����ʹ��synchronized��,�÷���һ������ͬ��Ч��
 * ��̬����ָ����������Ϊ��ǰ��������(Class��ʵ��,���淴��֪ʶ��������)
 * ÿ����JVM���ص��඼����ֻ��һ��Classʵ��,���
 * ��̬�����������һ������ͬ��Ч��
 * @author QAIU
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Foo.dosome();
			}
		};
		
		t1.start();
		t2.start();
	}
}

class Foo{
//	public synchronized static void dosome() {
	public static void dosome() {
		/*
		 * ��̬������ʹ��ͬ����ʱ,ָ��ͬ������������
		 * ��Ȼѡ����ǰ��������
		 * ��ȡ���� ����.class
		 */
		synchronized (Foo.class) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+"��ʼִ��");
				Thread.sleep(1000);
				System.out.println(t.getName()+"���");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
