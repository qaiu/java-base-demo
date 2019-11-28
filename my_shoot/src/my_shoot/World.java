package my_shoot;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	
	Sky sky = new Sky();
	FlyingObject[] enemy = {
			new Ariplane(),
			new BigAriplane(),
			new Bee(),
			new Ariplane(),
			new BigAriplane(),
			new Bee()
	};
	
	public void paint(Graphics g) {
		sky.paintObject(g);
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].paintObject(g);
		}

	}
	
	public static void main(String[] args) {
		World w = new World();
		
		JFrame jf = new JFrame();
		jf.add(w);
		jf.setSize(400,700);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置出现位置居中
		jf.setLocationRelativeTo(null);
		// 显示窗体
		jf.setVisible(true);
		
	}
}
