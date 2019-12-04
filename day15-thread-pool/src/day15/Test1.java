package day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//����һ���̶��������̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		R1 r = new R1();
		//���񶪽��̳߳�,���õ�һ��ȡ��ƾ֤
		Future<?> future = pool.submit(r);
		//���ص��߳̽���,������ִ����������
		//1....2....3....4....5....
		//ִ����������,��ȡ��ƾ֤���ȴ�
		future.get();
		System.out.println("�߳�ִ�����");
	}
	
	static class R1 implements Runnable{
		
		@Override
		public void run() {
			System.out.println("ģ��һ����ʱ����");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}
	
}
