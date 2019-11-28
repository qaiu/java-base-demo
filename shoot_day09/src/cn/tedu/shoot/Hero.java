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
	private int doubleFire=0;

	public Hero() {
		// 152=400/2-97/2
		// 410����Ϸ�����п��µ�Y��λ�ã��ǹ����
		super(97, 139, 152, 410);
		life = 3;
		// doubleFire Ĭ��Ϊ0�����Բ���Ĭ��ֵ

	}

	int index=0;
	// Ӣ�ۻ�����ͼƬ�л���Ч�� 
	@Override
	public BufferedImage getImage() {
		return images[index++%images.length];
	}
	
	@Override
	public void step() {
	// ��ΪӢ�ۻ���������� ���Է�����ʲô����д	
	}
	
	//Ӣ�ۻ����ڷ���
	public Bullet[] shoot() {
		Bullet[] bs=null;
		// ����һ����������Ӣ�ۼ����ķ�֮һ�� �������
		int w = this.width/4-2; //-2�����ӵ���
		int h=20; //�����ӵ��ĸ�
		// ���û�л���ֵ
		if (doubleFire <= 0) {
			bs=new Bullet[1];
			bs[0]= new Bullet(x+2*w, y-h);
		}else {
			bs=new Bullet[2];
			bs[0]=new Bullet(x+w, y-h);
			bs[1]=new Bullet(x+3*w, y-h);
			doubleFire--;
		}
		return bs;
	}
	
	// Ӣ�ۻ��ƶ�����
	public void moveTo(int x,int y) {
		// ���������Ӣ�ۻ������� Ӣ�ۻ��������������ƶ�
		this.x=x-width/2;
		this.y=y-height/2;
	}
	// Ӣ�ۻ������ķ���
	public void addLife() {
		life++;
	}
	 // Ӣ�ۻ��ӻ�������
	public void addDoubleFire() {
		doubleFire+=5;
	}
	// ���Ӣ�ۻ�������
	public int getLife() {
		return life;
	}

	public void subLife() {
		life--;
	}

	public int getDoubleFire() {
		// TODO �Զ����ɵķ������
		return doubleFire;
	}
}
