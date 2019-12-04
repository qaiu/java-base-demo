package cn.tedu.shoot;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{
	// ��͸ߵĳ���
	public static final int WIDTH=400;
	public static final int HEIGHT=700;
	
	Hero hero=new Hero();
	Sky sky=new Sky();
	
	FlyingObject[] enemy= {
			new Airplane(),
			new BigAirplane(),
			new Airplane(),
			new BigAirplane(),
			new Airplane(),
			new BigAirplane(),
			new Bee(),
			new Bee(),
			new Bee()
	};
	
	Bullet[] bls= {
			new Bullet(200, 300),
			new Bullet(200, 360),
			new Bullet(200, 160),
	};
	
	public void start() {
		System.out.println("����OK");
	}
	// ���ƴ������շ���
	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);

		for (int i = 0; i < enemy.length; i++) {
			enemy[i].paintObject(g);
		}
		
		for (int i = 0; i < bls.length; i++) {
			bls[i].paintObject(g);
		}
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