package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.imageio.ImageIO;

public abstract class FlyingObject {
	// ÿ��������������״̬
	// ���� ���� �Ƴ�
	public static final int LIFE = 0;
	public static final int DEAD = 1;
	public static final int REMOVE = 2;
	// ���浱ǰ�������״̬����
	protected int state = LIFE; // ��ʼ״̬����

	// �������๫�õ�����
	protected int width;
	protected int height;
	protected int x;
	protected int y;

	// С�л���л��������Ĺ���
	public FlyingObject(int width, int height) {
		Random ran = new Random();
		this.width = width;
		this.height = height;
		x = ran.nextInt(400 - width);
		y = -height;
	}

	// ����ӵ�Ӣ�ۻ�
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("��:" + width + ",��:" + height);
		System.out.println("x:" + x + ",y:" + y);
	}

	// ����������ڶ�ȡͼƬ��java����
	public static BufferedImage readImage(String fileName) {
		try {
			// ��ȡӲ���ϵ�ͼƬ��img����
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	// �жϷ������Ƿ����
	public boolean isLife() {
		return state == LIFE;
	}

	// �жϷ������Ƿ�����
	public boolean isDead() {
		return state == DEAD;
	}

	// �жϷ������Ƿ��Ƴ�
	public boolean isRemove() {
		return state == REMOVE;
	}
	
	// ��д���󷽷�
	// ���ͼƬ(�������л��)
	public abstract BufferedImage getImage();
	
	// ���ƻ�õ�ͼƬ Graphics����
	public void paintObject(Graphics g) {
		// ����õ�ͼƬ���Ƶ����壨g��
		g.drawImage(getImage(),x,y,null);
	}
	// ��дһ�����󷽷� step()�ƶ�����
	public abstract void step();
	
	// ��дС�л� ��л� ������ ���緽��
	public boolean outOfBounds() {
		// y�������Ļ�߶Ⱦ��ǳ�����
		return y>World.HEIGHT;
	}
	
}
