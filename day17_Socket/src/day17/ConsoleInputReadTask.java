package day17;
import java.io.*;
import java.util.concurrent.Callable;

public class ConsoleInputReadTask implements Callable<String> {
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
  public String call() throws IOException {
    System.out.println("ConsoleInputReadTask run() called.");
    String input;
    do {
      System.out.println("Please type something: ");
      try {
        // wait until we have data to complete a readLine()
        while (!br.ready()  /*  ADD SHUTDOWN CHECK HERE */) {
          Thread.sleep(200);
        }
        input = br.readLine();
      } catch (InterruptedException e) {
        System.out.println("ConsoleInputReadTask() cancelled");
        return null;
      }catch (Exception e) {
    	  System.out.println("流关闭");
		return null;
	}
    } while ("".equals(input));
    System.out.println("Thank You for providing input!");
    return input;
  }
  public static void main(String[] args) throws IOException {
	ConsoleInputReadTask c = new ConsoleInputReadTask();
	
	new Thread(()-> {
	try {
		Thread.sleep(3000);
		System.out.println("执行中断");
		c.br.close();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}).start();;
	System.out.println(c.call());
}
}