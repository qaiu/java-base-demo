package cn.tedu.shoot;

public class BigAirplane extends FlyingObject{
	//大敌机的属性
	int step; // 速度
	
	public BigAirplane() {
		super(66, 89);
		step=2;
	}
	
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("速度:"+step);
	}
}
