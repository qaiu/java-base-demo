package cn.tedu.shoot;

import java.awt.image.BufferedImage;

//С�л���
public class Airplane extends FlyingObject{
	//���屣��С�л���ҪͼƬ������
	
	private static BufferedImage[] images;
	// ��̬�飬�ڼ��ر���ʱ����ͼƬ���鸳ֵ
	static {
		images= new BufferedImage[5];
		// Ϊ����Ԫ�ظ�ֵ
		images[0]=readImage("airplane0.png");
		for (int i = 1; i < images.length; i++) {
			images[i]=readImage("bom"+i+".png");
		}
	}
	
	//С�л�������
	 int step; // �ٶ�
	
	public Airplane() {
		super(48, 50);
		step=4;
	}
	//С�л����������
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("�ٶ�:"+step);
	}
}
