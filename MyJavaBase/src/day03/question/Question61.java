package day03.question;

public class Question61 {
	public static void main(String[] args) {
		boolean flag=true;
		for (int i = 2; i < 1000000; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j==0) {
					flag=false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
			flag=true;
		}
	}

}
