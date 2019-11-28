package day03.question;

public class Question541 {
	public static void main(String[] args) {
		int day = 1;
		double distance = 0;
		while (true) {
			distance += 5;
			if (distance>56.7) {
				break;
			}
			distance -= 3.5;
			
			day++;
		}
		System.out.println("ĞèÒª"+day+"Ìì");
	}
}