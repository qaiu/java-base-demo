package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {

	private static BufferedImage images[];

	static {
		images = new BufferedImage[2];
		images[0] = readImage("hero0.png");
		images[1] = readImage("hero1.png");
	}
	private int life; // ����ֵ
	private int doubleFire;

	public Hero() {
		// 152=400/2-97/2
		// 410����Ϸ�����п��µ�Y��λ�ã��ǹ����
		super(97, 139, 152, 410);
		life = 3;
		// doubleFire Ĭ��Ϊ0�����Բ���Ĭ��ֵ

	}

	public void show() {
		System.out.println("��" + width + ",��:" + height);
		System.out.println("x:" + x + ",y:" + y);
		System.out.println("����ֵ:" + life);
		System.out.println("����ֵ:" + doubleFire);
	}
	
	int index=0;
	// Ӣ�ۻ�����ͼƬ�л���Ч�� 
	@Override
	public BufferedImage getImage() {
		return images[index++%images.length];
	}

}
