package game;

import java.util.Random;

public class GuessNumber extends GuessGame{

	@Override
	public String suiJi() {
		int num = new Random().nextInt(1000)+1;
		return Integer.toString(num);
	}

	@Override
	public void tiShi() {
		System.out.println("请猜数字");
	}

	@Override
	public String biJiao(String c, String r) {
		int c1 = Integer.parseInt(c);
		int r1 = Integer.parseInt(r);
		if (c1 > r1) {
			return "猜大了";
		} else if (c1 < r1) {
			return "猜小了";
		} else {
			return "猜对了";
		}
	}

	@Override
	public boolean caiDui(String jieGuo) {
		if ("猜对了".equals(jieGuo)) {
			return true;			
		}
		return false;
	}
	
	

}
