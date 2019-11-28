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
	private int doubleFire=0;

	public Hero() {
		// 152=400/2-97/2
		// 410是游戏界面中靠下的Y轴位置，是估算的
		super(97, 139, 152, 410);
		life = 3;
		// doubleFire 默认为0，可以采用默认值

	}

	int index=0;
	// 英雄机两张图片切换的效果 
	@Override
	public BufferedImage getImage() {
		return images[index++%images.length];
	}
	
	@Override
	public void step() {
	// 因为英雄机跟着鼠标走 所以方法中什么不用写	
	}
	
	//英雄机开炮方法
	public Bullet[] shoot() {
		Bullet[] bs=null;
		// 声明一个变量接收英雄级的四分之一宽 方便计算
		int w = this.width/4-2; //-2修正子弹宽
		int h=20; //保存子弹的高
		// 如果没有火力值
		if (doubleFire <= 0) {
			bs=new Bullet[1];
			bs[0]= new Bullet(x+2*w, y-h);
		}else {
			bs=new Bullet[2];
			bs[0]=new Bullet(x+w, y-h);
			bs[1]=new Bullet(x+3*w, y-h);
			doubleFire--;
		}
		return bs;
	}
	
	// 英雄机移动方法
	public void moveTo(int x,int y) {
		// 鼠标坐标在英雄机的中心 英雄机的坐标向左上移动
		this.x=x-width/2;
		this.y=y-height/2;
	}
	// 英雄机加命的方法
	public void addLife() {
		life++;
	}
	 // 英雄机加火力方法
	public void addDoubleFire() {
		doubleFire+=5;
	}
	// 获得英雄机的命数
	public int getLife() {
		return life;
	}

	public void subLife() {
		life--;
	}

	public int getDoubleFire() {
		// TODO 自动生成的方法存根
		return doubleFire;
	}
}
