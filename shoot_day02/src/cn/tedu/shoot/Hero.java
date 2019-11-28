package cn.tedu.shoot;

public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life; //生命值
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
		System.out.println("宽："+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("生命值:"+life);
		System.out.println("火力值:"+doubleFire);
	}
	
}
