package day03.question;

import java.util.Arrays;

public class Question611 {
	public static void main(String[] args) {
		//ËØÊıÉ¸·¨
		int M = 1000000;
		int[] mark = new int[M]; // 1:prime number
		Arrays.fill(mark, 1);
		mark[0] = mark[1] = 0;
		for (int i = 2; i <= Math.sqrt((float) M); i++) {
			if (mark[i] != 0) {
				for (int j = i * i; j < M; j += i) {
					if (mark[j] != 0) {
						mark[j] = 0;
					}
				}
			}
		}

		for (int i = 0; i < M; i++) {
			if (mark[i] != 0) {
				System.out.println(i);
			}
		}
	}

}
