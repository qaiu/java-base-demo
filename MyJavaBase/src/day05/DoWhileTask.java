package day05;

public class DoWhileTask {

	public static void main(String[] args) {
		
		int sum=0;
		int salary=4000;
		int i=0;
		 do {
			sum+=salary;
			salary+=200;
			i++;
			System.out.println(i+">"+sum);

		} while (sum<150000);
		System.out.println(i);
	}

}
