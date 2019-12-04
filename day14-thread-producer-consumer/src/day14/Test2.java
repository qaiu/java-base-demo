package day14;

/*
 * 
 * static int i;
 * 
 * 线程1
 * 		i++		i++		i++		i++
 * 		i++		i++		i++
 * 
 * 线程2
 * 		i%2==1	i%2==1	i%2==1	i%2==1	
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		t1.start();
		R1 r2 = new R1();
		while(true) {
			int i = r2.getI();
			if(i%2 == 1) {
				System.out.println("main:"+i);
				System.exit(0);
			}
		}
	}
	
	static public class R1 implements Runnable{
		static int i;
		public static synchronized int getI() {
			return i;
		}
		private static synchronized void add() {
			i++;
			i++;
		}
		@Override
		public void run() {
			
			while (true) {
				System.out.println(""+i);
				add();
			}
		}
	}
}
