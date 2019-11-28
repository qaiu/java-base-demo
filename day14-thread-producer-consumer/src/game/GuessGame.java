package game;

import java.util.Scanner;

/**
 * 
 * 包含猜数字和猜字母两个游戏的通用代码
 * @author QAIU
 *
 */
abstract public class GuessGame {
	//启动游戏,通用的游戏流程代码
	public void qiDong() {
		//产生随机值,不同就调方法
		String r = suiJi();
//		System.out.println(r);
		//显示提示
		tiShi();
		//循环猜
		while (true) {
			System.out.println("猜:　");
			String c = new Scanner(System.in).nextLine();
			//比较猜的值,和随机值
			String jieGuo = biJiao(c,r);
			System.out.println(jieGuo);
			//jieGuo是否是猜对的结果
			if (caiDui(jieGuo)) {
				break;
			}
		}
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String jieGuo);
}
