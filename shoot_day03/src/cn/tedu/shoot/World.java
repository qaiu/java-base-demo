package cn.tedu.shoot;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{
	
	Hero hero=new Hero();
	Sky sky=new Sky();
	
	FlyingObject[] enemy=new FlyingObject[6];
	Bullet[] bls=new Bullet[3];
	public void start() {
		System.out.println("���Բ��԰����°�˹�ٲ���ad�ҷɲ���������ʾ");
	}
	
	public static void main(String[] args) {
		World w=new World();
		// ʵ����һ���������
		JFrame jf=new JFrame("�ɻ���ս");
		// ��world�������봰�����
		jf.add(w);
		// ���ô���Ŀ��
		jf.setSize(400,700);
		// ���õ����Ͻǲ�ʱͬʱ��������
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ó���λ�þ���
		jf.setLocationRelativeTo(null);
		// ��ʾ����
		jf.setVisible(true);
		
		w.start();
	}

}