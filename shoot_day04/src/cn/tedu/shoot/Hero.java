package cn.tedu.shoot;

public class Hero extends FlyingObject{
	private int life; //����ֵ
	private int doubleFire;
	public Hero() {
		// 152=400/2-97/2
		// 410����Ϸ�����п��µ�Y��λ�ã��ǹ����
		super(97, 139, 152, 410);
		life=3;
		//doubleFire Ĭ��Ϊ0�����Բ���Ĭ��ֵ
		
	}
	// �������η���ע������
	// ���е����Ժͷ�����4��
	// ������ֻ����public����Ĭ�����η�����
	// �Ǹ�������˽��
	// �������Ա���
	// ��������

	public void show() {
		System.out.println("��"+width+",��:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("����ֵ:"+life);
		System.out.println("����ֵ:"+doubleFire);
	}
	
}
