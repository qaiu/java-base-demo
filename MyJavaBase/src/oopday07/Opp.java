package oopday07;

import java.util.Timer;
import java.util.TimerTask;

public class Opp {
	
	int a;
	public void start() {
		int a=5;

		int b=1;
		Fu fu=new Fu() {
			@Override
			public void aaa() {
				
				a=6;
				// TODO 自动生成的方法存根
				
			}
		};
		
		Timer timer=new Timer();
		TimerTask timerTask=new TimerTask() {

			int i=0;
			@Override
			public void run() {
				System.out.println(i++);
			}
		};
		timer.schedule(timerTask, 1000, 1000);
	}
	
	public static void main(String[] args) {
		new Opp().start();
	}

}
