package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject{
	private static BufferedImage image;
	static {
		// ��Ϊ������������ֱ�Ӹ�ֵ
		image = readImage("bullet.png");
	}
	private int step;
	
	public Bullet(int x,int y){
		
		super(8, 20,x,y);
		step=2;
	}
	
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("�ٶ�"+step);
	}
	
	public BufferedImage getImage() {
		BufferedImage img = null;
		// ������ŷ���ͼƬ
		if (isLife()) {
			img=image;
		} else if(isDead()){
			state=REMOVE;
		}
		// �������ֱ���Ƴ�
		return img;
	}
	
}
