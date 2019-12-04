package day13;
/**
 * ���߳�Ч�ʲ���:��������
 * @author QAIU
 *
 */
public class Test9 {
	//�����������ֵ
	static final int MAX_VALUE = 1000000;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--���߳�-----------------");
		f1();
		System.out.println("--5���߳�-----------------");
		f2();
	}
	
	private static void f1() throws InterruptedException {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0, MAX_VALUE);
		t1.start();
		
		//ȡ���֮ǰ,main����ͣ�ȴ�t1����
		t1.join();
		int c = t1.count;
		
		t = System.currentTimeMillis()-t;
		System.out.println("����: "+c);
		System.out.println("ʱ��: "+t);
	}

	private static void f2() throws InterruptedException {
		long t = System.currentTimeMillis();
		
		T1[] a = new T1[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new T1(i*MAX_VALUE/a.length, (i+1)*MAX_VALUE/a.length);
			a[i].start();
		}
		
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			//ȡ���ǰ,����ͣ�ȴ��߳̽���
			a[i].join();
			c += a[i].count;
		}
		
		t = System.currentTimeMillis()-t;
		System.out.println("����: "+c);
		System.out.println("ʱ��: "+t);
	}

	static class T1 extends Thread {
		int from;
		int to;
		int count;//�������
		//alt+shift+s, ����contructor using fields
		public T1(int from, int to) {
			if (from <= 2) {
				from = 3;
				count = 1;//��1����֪��������2
			}
			this.from = from;
			this.to = to;
		}
		
		@Override
		public void run() {
			// [from, to)
			for (int i = from; i < to; i++) {
				if (isPrime(i)) {//�ж�i��ֵ�Ƿ�������
					count++;
				}
			}
		}

		private boolean isPrime(int i) {
			//i����+1
			double m = 1 + Math.sqrt(i);
			//2��m���ܰ�i������ֵ
			for (int j = 2; j < m; j++) {
				if (i%j==0) {//�ҵ��ܰ�i������ֵ
					return false;//i��������
				}
			}
			return true;//û���ҵ���������ֵ,i������
		}
	}
}
