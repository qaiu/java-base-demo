package day05;

public class DoWhileTask0 {

	public static void main(String[] args) {
		
		int sum=0;
		int salary=4000;
		int i=1;
		do {
			sum+=salary;
			i++;
			//System.out.println(i+">"+sum);
			salary+=200;
		} while (i<=12);
		System.out.println(sum);
	}

}
