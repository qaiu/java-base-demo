package cn.tedu.shoot;

import java.awt.image.BufferedImage;
import java.util.Random;


public class Bee extends FlyingObject 
					implements Award{
	private static BufferedImage images[];
	static {
		images = new BufferedImage[5];
		images[0]=readImage("bee0.png");
		for (int i = 1; i < images.length; i++) {
			images[i]=readImage("bom"+i+".png");
		}
	}
	
	int xStep; //横向移动速度
	int yStep; //纵向移动速度
	
	public Bee() {
		super(60, 51);
		xStep=2;
		yStep=2;
	}
	
	int index=1;
	
	@Override
	public BufferedImage getImage() {
		BufferedImage img = null;
		if (isLife()) {
			img=images[0];
		} else if (isDead()) {
			img=images[index++];
			if (index>=images.length) {
				state=REMOVE;
			}
		}
		return img;
	}
	
	@Override
	public void step() {
		y+=yStep;
		if (x >= World.WIDTH-width || x <= 0) {
			xStep*=-1;
		}
		x += xStep;
	}

	@Override
	public int getAward() {
		return new Random().nextInt(2);
	}

}
