package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * JDK8±Õ°üÑÝÊ¾
 * @author QAIU
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int answer = 42;
		Thread t = new Thread(new Runnable() {
		    public void run() {
		        System.out.println("The answer is: " + answer);
		    }
		});
		t.start();
		
		List<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			values.add(new Random().nextInt(8)+10);
		}
		
		values.forEach(x->System.out.print(x+" "));
		System.out.println();
		int result = values.stream()
				  .filter(e -> e > 3)
				  .filter(e -> e % 2 == 0)
				  .map(e -> e * 2)
				  .findFirst()
				  .orElse(0);
		System.out.println(result);
	}
}
