package my_shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;

public abstract class FlyingObject {
	// ÿ��������������״̬ ���� ���� �Ƴ�
	public static final int LIFT = 0;
	public static final int DEAD = 1;
	public static final int REMOVE = 2;
	// ���浱ǰ����״̬����
	protected int state = LIFT;
	
	// �������๫������
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	// С�л� ��л� �������Ĺ���
	public FlyingObject(int weigth, int height) {
		Random ran = new Random();
		this.width = weigth;
		this.height = height;
		x=ran.nextInt(400-width);
		y=height;
	}

	// ����ӵ�Ӣ�ۻ� ����
	public FlyingObject(int weigth, int height, int x, int y) {
		this.width = weigth;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/*
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
	}*/
	// �˷������ڶ�ȡͼƬ��java����
	public static BufferedImage readImage(String fileName) {
		try {
			//��ȡӲ��ͼƬ��img����
			BufferedImage img=ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	public boolean isLift() {
		return state == LIFT;
	}
	public boolean isDead() {
		return state == DEAD;
	}
	public boolean isRemove() {
		return state == REMOVE;
	}
	
	// ���󷽷� �������ȡ�Լ���ͼƬ
	public abstract BufferedImage getImage();
	
	// ���ƻ�ȡ��ͼƬ 
	public void paintObject(Graphics g) {
		g.drawImage(getImage(), x, y, null);
	}
	
	
}
