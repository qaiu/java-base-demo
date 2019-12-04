package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		System.out.println("ÇëÑ¡Ôñ:");
		System.out.println("1.²ÂÊý×Ö");
		System.out.println("2.²Â×ÖÄ¸");
		GuessGame game;
		int mode = new Scanner(System.in).nextInt();
		if (mode == 1) {
			game = new GuessNumber();
		}else {
			game = new GuessLetter();
		}
		game.qiDong();
	}
}
