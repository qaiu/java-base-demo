package cn.tedu.shoot;

public class Sky extends FlyingObject{
	int step;
	int y1; //第二张背景图的Y轴
	
	public Sky() {
		super(400, 700, 0, 0);
		
		this.y1=-700;//第二张背景图在界面上方
	}
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y+"y1:"+y1);
		System.out.println("速度:"+step);
	}
}
