package cn.tedu.shoot;

import java.util.Random;

public class FlyingObject {
	//�������๫�õ�����
	int width;
	int height;
	int x;
	int y;
	
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
	
	
}
