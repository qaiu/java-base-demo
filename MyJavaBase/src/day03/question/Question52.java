package day03.question;

public class Question52 {
	public static void main(String[] args) {
		int time=50;
		int sum=0;
		for (int i = 0; i < 25; i++) {
			sum+=time;
			time++;
		}
		System.out.println(sum);
	}

}
