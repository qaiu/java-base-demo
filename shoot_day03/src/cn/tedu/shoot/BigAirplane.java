package cn.tedu.shoot;

public class BigAirplane extends FlyingObject{
	//��л�������
	int step; // �ٶ�
	
	public BigAirplane() {
		super(66, 89);
		step=2;
	}
	
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("�ٶ�:"+step);
	}
}
