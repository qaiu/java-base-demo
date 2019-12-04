package cn.tedu.shoot;

public class Bee {
	int width; 
	int height; 
	int x; 
	int y; 
	int xStep; //横向移动速度
	int yStep; //纵向移动速度
	
	public Bee() {
	}
	
	public Bee(int width,int height,int x,int y,int xStep,int yStep) {
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
		this.xStep=xStep;
		this.yStep=yStep;
	}
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("x速度:"+xStep+",y速度:"+yStep);
	}
}
