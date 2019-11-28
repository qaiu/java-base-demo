package day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			while(true) {
				System.out.println(sdf.format(new Date()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Ë­TMDÍ±ÐÑÀÍ×ÊÁË!!!!!!!!");
					break;
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			while(true) {
				new Scanner(System.in).nextLine();
				t1.interrupt();
			}
		});
		t1.start();
		t2.start();
	}

}
