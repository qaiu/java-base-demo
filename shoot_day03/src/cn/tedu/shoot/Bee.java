package cn.tedu.shoot;

public class Bee extends FlyingObject{
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
}
