package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {

	private static BufferedImage images[];

	static {
		images = new BufferedImage[2];
		images[0] = readImage("hero0.png");
		images[1] = readImage("hero1.png");
	}
	private int life; // 生命值
	private int doubleFire;

	public Hero() {
		// 152=400/2-97/2
		// 410是游戏界面中靠下的Y轴位置，是估算的
		super(97, 139, 152, 410);
		life = 3;
		// doubleFire 默认为0，可以采用默认值

	}

	public void show() {
		System.out.println("宽：" + width + ",高:" + height);
		System.out.println("x:" + x + ",y:" + y);
		System.out.println("生命值:" + life);
		System.out.println("火力值:" + doubleFire);
	}
	
	int index=0;
	// 英雄机两张图片切换的效果 
	@Override
	public BufferedImage getImage() {
		return images[index++%images.length];
	}

}
