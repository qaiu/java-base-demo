package thread;

public class SleepSort {	
	public static void main(String[] args) {
		//Java Ë¯ÃßÅÅÐò 
		int[] arr = {200,500,1111,111,22,2,33,44,5,5,8,4,3,2,1,7};
		for (int i = 0; i < arr.length; i++) {
			final int sleepTime = arr[i];
			 new Thread() {
				@Override
				public void run() {
					try {
						sleep(sleepTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(sleepTime);
				}
			}.start();
		}
	}

}
