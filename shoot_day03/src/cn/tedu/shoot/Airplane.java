package cn.tedu.shoot;

//С�л���
public class Airplane extends FlyingObject{
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
