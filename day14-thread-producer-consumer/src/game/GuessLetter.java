package game;

import java.util.Random;

public class GuessLetter extends GuessGame{

//	@Override
//	public String suiJi() {
//		char[] c = new char[5];
//		Random ran = new Random();
//		for (int i = 0; i < c.length; i++) {
//			char r = (char) ('A' + ran.nextInt(26));
//			while (subCharAt(c, r, i)) {
//				r = (char) ('A' + ran.nextInt(26));
//			}
//			c[i] = r;
//		}
//		System.out.println(Arrays.toString(c));
//		return new String(c);
//	}
//	private boolean subCharAt(char[] c,char r,int i){
//		for (int j = 0; j < i; j++) {
//			if (c[j] == r) {
//				return true;
//			}
//		}
//		return false;
//	}
	// 1a2b3c.split("[\\d]?")
	@Override
	public String suiJi() {
		StringBuilder sb = new StringBuilder();
		for (char i = 'A'; i < 'Z'; i++) {
			sb.append(i);
		}
		for (int i = 0; i < 5; i++) {
			int j = new Random().nextInt(26 - i) + i;
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		return sb.substring(0,5);
	}
	
	
	@Override
	public void tiShi() {
		System.out.println("请猜字母");
	}

	@Override
	public String biJiao(String c, String r) {
		if (c.matches("[A-Z]{5}") == false) {
			return "格式不对!";
		}
		int a = 0, b = 0;
		for (int i = 0; i < 5; i++) {
			int index = r.indexOf(c.charAt(i));
			if (index == i) {
				a++;
			} else if (index > -1) {
				b++;
			}
		}
		return "A"+a+"B"+b;
	}

	@Override
	public boolean caiDui(String jieGuo) {
		return "A5B0".equals(jieGuo);
	}

}
