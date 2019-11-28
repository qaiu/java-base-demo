package cn.tedu.shoot;

import java.util.Random;

public class FlyingObject {
	//所有子类公用的属性
	int width;
	int height;
	int x;
	int y;
	
	//小敌机大敌机奖励机的构造
	public FlyingObject(int width, int height) {
		Random ran=new Random();
		this.width = width;
		this.height = height;
		x=ran.nextInt(400-width);
		y=-height;
	}

	//天空子弹英雄机
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
	}
	
	
}
