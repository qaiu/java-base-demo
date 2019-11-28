package cn.tedu.shoot;

import java.awt.image.BufferedImage;


public class Bee extends FlyingObject{
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
	
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("x速度:"+xStep+",y速度:"+yStep);
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
	
	
	
}
