package cn.tedu.shoot;

public class Sky extends FlyingObject{
	int step;
	int y1; //�ڶ��ű���ͼ��Y��
	
	public Sky() {
		super(400, 700, 0, 0);
		
		this.y1=-700;//�ڶ��ű���ͼ�ڽ����Ϸ�
	}
	public void show() {
		System.out.println("��:"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y+"y1:"+y1);
		System.out.println("�ٶ�:"+step);
	}
}
