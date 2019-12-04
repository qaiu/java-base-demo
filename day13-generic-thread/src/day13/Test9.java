package day13;
/**
 * 多线程效率测试:素数个数
 * @author QAIU
 *
 */
public class Test9 {
	//定义区间最大值
	static final int MAX_VALUE = 1000000;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--单线程-----------------");
		f1();
		System.out.println("--5个线程-----------------");
		f2();
	}
	
	private static void f1() throws InterruptedException {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0, MAX_VALUE);
		t1.start();
		
		//取结果之前,main先暂停等待t1结束
		t1.join();
		int c = t1.count;
		
		t = System.currentTimeMillis()-t;
		System.out.println("计数: "+c);
		System.out.println("时间: "+t);
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
			//取结果前,先暂停等待线程结束
			a[i].join();
			c += a[i].count;
		}
		
		t = System.currentTimeMillis()-t;
		System.out.println("计数: "+c);
		System.out.println("时间: "+t);
	}

	static class T1 extends Thread {
		int from;
		int to;
		int count;//计数结果
		//alt+shift+s, 生成contructor using fields
		public T1(int from, int to) {
			if (from <= 2) {
				from = 3;
				count = 1;//有1个已知的质数是2
			}
			this.from = from;
			this.to = to;
		}
		
		@Override
		public void run() {
			// [from, to)
			for (int i = from; i < to; i++) {
				if (isPrime(i)) {//判断i的值是否是质数
					count++;
				}
			}
		}

		private boolean isPrime(int i) {
			//i开方+1
			double m = 1 + Math.sqrt(i);
			//2到m找能把i整除的值
			for (int j = 2; j < m; j++) {
				if (i%j==0) {//找到能把i整除的值
					return false;//i不是质数
				}
			}
			return true;//没有找到能整除的值,i是质数
		}
	}
}
