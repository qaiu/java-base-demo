package cn.tedu.shoot;

public class Bullet extends FlyingObject{
	int step;
	
	public Bullet(int x,int y){
		super(8, 20,x,y);
		step=2;
	}
	
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("�ٶ�"+step);
	}
	
	
}
