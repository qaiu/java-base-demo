package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ�����������
 * 1 �̵߳�����
 * �̵߳��������ڲ�Ӧ�����������������һ��
 * ������ܻ�����̵߳�Ƶ������������,��ϵͳ��������Ҫ�Ŀ���\
 * 
 * 2:�����̵߳�����
 * һ̨������ܳ��صĲ������غܶ൫�Ƕ�����һ�����޶ȵ�
 * �����ͻ��ڴ����cpu�����л� ��������߳�����Ч�ʽ���
 * @author QAIU
 *
 */
public class TheradPoolDemo {
	public static void main(String[] args) {
		//�����̳߳� ʹ��һ��intֵָ���߳�����
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			Runnable r = () -> {
				try {
					Thread thread = Thread.currentThread();
					System.out.println(thread+"����ִ��!");
					Thread.sleep(5000);
					System.out.println(thread+"ִ�����!");
				} catch (Exception e) {
				}
			};
			//�����񽻸��߳�
			threadPool.execute(r);
			System.out.println("�����̳߳���һ������");
			System.out.println("ѭ������");
		}
		
		threadPool.shutdown();
		System.out.println("���Թر���");
	}
	
}
