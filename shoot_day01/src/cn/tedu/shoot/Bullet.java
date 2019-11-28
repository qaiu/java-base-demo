package cn.tedu.shoot;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int step;
	
	public Bullet(){
		
	}
	
	public Bullet(int width,int heigth,int x,int y,int step) {
		this.height=heigth;
		this.width=width;
		this.x=x;
		this.y=y;
		this.step=step;
	}
	
	public void show() {
		System.out.println("¿í:"+width+",¸ß:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("ËÙ¶È"+step);
	}

}
