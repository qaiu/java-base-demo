package cn.tedu.shoot;

public class Bee {
	int width; 
	int height; 
	int x; 
	int y; 
	int xStep; //�����ƶ��ٶ�
	int yStep; //�����ƶ��ٶ�
	
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
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("x�ٶ�:"+xStep+",y�ٶ�:"+yStep);
	}
}
