package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject{
	private static BufferedImage image;
	static {
		image=readImage("background0.png");
	}
	private int step;
	private int y1; //�ڶ��ű���ͼ��Y��

	public Sky() {
		super(400, 700, 0, 0);

		this.y1=-700;//�ڶ��ű���ͼ�ڽ����Ϸ�
		step=1;
	}
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y+"y1:"+y1);
		System.out.println("�ٶ�:"+step);
	}

	@Override
	public BufferedImage getImage() {
		return image;
	}

	// �����
	@Override
	public void paintObject(Graphics g){
		// �����Ҫ������ͼ
		g.drawImage(getImage(),x,y, null);
		g.drawImage(getImage(),x,y1, null);		
	}

	public void step() {
		y+=step;
		y1+=step;
		//���y>=700 ���߽�
		if (y>=World.HEIGHT) {
			y=-World.HEIGHT;
		}

		if (y1>=World.HEIGHT) {
			y1=-World.HEIGHT;
		}
	}
}
