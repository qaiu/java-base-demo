package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class BigAirplane extends FlyingObject 
							implements Score{

	private static BufferedImage[] images;
	static {
		images = new BufferedImage[5];
		images[0] = readImage("bigairplane0.png");
		for (int i = 1; i < images.length; i++) {
			images[i] = readImage("bom" + i + ".png");
		}
	}

	// 大敌机的属性
	private int step; // 速度

	public BigAirplane() {
		super(66, 89);
		step = 2;
	}

	public void show() {
		System.out.println("宽:" + width + ",高:" + height);
		System.out.println("x:" + x + ",y:" + y);
		System.out.println("速度:" + step);
	}
	
	int index=1;
	@Override
	public BufferedImage getImage() {
		BufferedImage img = null;
		if (isLife()) {
			img=images[0];
		}else if (isDead()){
			img=images[index++];
			if (index>=images.length) {
				state=REMOVE;
			}
			
		}
		return img;
	}
	@Override
	public void step() {
		y+=step;
	}

	@Override
	public int getScore() {
		return 2; // 击中小敌机得一分
	}
}
