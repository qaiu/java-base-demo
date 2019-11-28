package day05;


public class ForTask2 {


	public static void main(String[] args) {
		

		int salary=4000;
		int sum=0;
		for (int i = 0; i < 12; i++) {
			sum+=salary;
			salary+=200;
		}
		System.out.println(sum);
	}

}
