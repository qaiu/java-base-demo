package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		System.out.println("��ѡ��:");
		System.out.println("1.������");
		System.out.println("2.����ĸ");
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
