package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject{
	private static BufferedImage image;
	static {
		image=readImage("background0.png");
	}
	private int step;
	private int y1; //第二张背景图的Y轴

	public Sky() {
		super(400, 700, 0, 0);

		this.y1=-700;//第二张背景图在界面上方
		step=1;
	}
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y+"y1:"+y1);
		System.out.println("速度:"+step);
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	// 画天空
	@Override
	public void paintObject(Graphics g){
		// 天空需要画两张图
		g.drawImage(getImage(),x,y, null);
		g.drawImage(getImage(),x,y1, null);		
	}

	public void step() {
		y+=step;
		y1+=step;
		//如果y>=700 出边界
		if (y>=World.HEIGHT) {
			y=-World.HEIGHT;
		}

		if (y1>=World.HEIGHT) {
			y1=-World.HEIGHT;
		}
	}
}
