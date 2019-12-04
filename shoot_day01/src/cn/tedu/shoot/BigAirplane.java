package cn.tedu.shoot;

public class BigAirplane {
	//大敌机的属性
	int width; // 宽
	int height; // 高
	int x; // x轴
	int y; // y轴
	int step; // 速度
	
	public BigAirplane() {
		// TODO 自动生成的构造函数存根
	}
	public BigAirplane(int width,int height,int x,int y,int step) {
		// 为属性赋值
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
		this.step=step;
	}
	
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("速度:"+step);
	}
}
