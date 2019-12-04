package cn.tedu.shoot;

import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.management.RuntimeErrorException;

public class FlyingObject {
	//�������๫�õ�����
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	
	//С�л���л��������Ĺ���
	public FlyingObject(int width, int height) {
		Random ran=new Random();
		this.width = width;
		this.height = height;
		x=ran.nextInt(400-width);
		y=-height;
	}

	//����ӵ�Ӣ�ۻ�
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
	}
	
	// ����������ڶ�ȡͼƬ��java����
	public static BufferedImage readImage(String fileName) {
		try {
			// ��ȡӲ���ϵ�ͼƬ��img����
			BufferedImage img=ImageIO.read(
					FlyingObject.class.getResource(fileName));
			return img;
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
}
