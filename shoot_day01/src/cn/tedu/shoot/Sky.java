package cn.tedu.shoot;

public class Sky {
	int width;
	int height;
	int x;
	int y;
	int step;
	int y1; //�ڶ��ű���ͼ��Y��
	
	public Sky() {
		
	}
	public Sky(int width,int heigth,int x,int y,int step,int y1) {
		this.width=width;
		this.height=heigth;
		this.x=x;
		this.y=y;
		this.step=step;
		this.y1=y1;
	}
	
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y+"y1:"+y1);
		System.out.println("�ٶ�:"+step);
	}
}
