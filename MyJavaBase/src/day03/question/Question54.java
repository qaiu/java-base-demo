package day03.question;

public class Question54 {
	public static void main(String[] args) {
		int day = 0;
		int count=0;
		double distance = 0;
		while (distance<56.7) {
			if (count%2 == 0) {
				distance += 5;
				day++;
			}else {
				distance -= 3.5;
			}
			count++;
		}
		System.out.println("ÐèÒª"+day+"Ìì");
	}
}