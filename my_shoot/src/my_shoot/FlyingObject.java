package my_shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;

public abstract class FlyingObject {
	// 每个飞行物有三种状态 活着 死了 移除
	public static final int LIFT = 0;
	public static final int DEAD = 1;
	public static final int REMOVE = 2;
	// 保存当前飞行状态属性
	protected int state = LIFT;
	
	// 所有子类公共属性
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	// 小敌机 大敌机 奖励机的构造
	public FlyingObject(int weigth, int height) {
		Random ran = new Random();
		this.width = weigth;
		this.height = height;
		x=ran.nextInt(400-width);
		y=height;
	}

	// 天空子弹英雄机 构造
	public FlyingObject(int weigth, int height, int x, int y) {
		this.width = weigth;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/*
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
	}*/
	// 此方法用于读取图片到java程序
	public static BufferedImage readImage(String fileName) {
		try {
			//读取硬盘图片到img对象
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public boolean isLift() {
		return state == LIFT;
	}
	public boolean isDead() {
		return state == DEAD;
	}
	public boolean isRemove() {
		return state == REMOVE;
	}
	
	// 抽象方法 让子类获取自己的图片
	public abstract BufferedImage getImage();
	
	// 绘制获取的图片 
	public void paintObject(Graphics g) {
		g.drawImage(getImage(), x, y, null);
	}
	
	
}
