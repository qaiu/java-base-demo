package cn.tedu.shoot;

public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life; //����ֵ
	int doubleFire;
	public Hero() {
		
	}
	public Hero(int width,int heigth,int x,int y,int life,int doubleFire) {
		this.width=width;
		this.height=heigth;
		this.x=x;
		this.y=y;
		this.life=life;
		this.doubleFire=doubleFire;
	}
	public void show() {
		System.out.println("��"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("����ֵ:"+life);
		System.out.println("����ֵ:"+doubleFire);
	}
	
}
