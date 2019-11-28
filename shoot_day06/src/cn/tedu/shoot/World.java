package cn.tedu.shoot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel {
	// ��͸ߵĳ���
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	public static final int INTERVAL = 20;
	Hero hero = new Hero();
	Sky sky = new Sky();

	FlyingObject[] enemy = {};
	Bullet[] bls = {};

	static CFPSMaker fpsMaker;
	static String fps;
	static {
		
		// ��ʼ��fpsͳ��
		fpsMaker = new CFPSMaker();
		fpsMaker.setNowFPS(System.nanoTime());
		fpsMaker.makeFPS();
	}
	
	public void start() {
		// ��д��ʱ��
		Timer timer = new Timer();
		// ����ʱ����
		int interval = INTERVAL;
		// ��д��ʱ���������е�����
		// �����ڲ�����ʵ��
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// �ɼ�ʱ�����ڵ��õķ���
				moveAction();
				enemyEnterAction();

				bulletEnterAction();
				repaint();

			}
		};
		timer.schedule(task, 0, interval);
	}

	// �������ƶ�����
	public void moveAction() {
		sky.step(); // ����ƶ�
	

		// ���ел��ƶ�
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].step();
		}
		// �����ӵ��ƶ�
		for (int i = 0; i < bls.length; i++) {
			bls[i].step();
		}
	}

	int enemyIndex = 1;

	// �л������ķ���
	public void enemyEnterAction() {
		// ����һ�ܵл�
		if (enemyIndex % 50 == 0) {
			FlyingObject f = makeEnemy();
			// �ѵ�ǰ�л���������1
			enemy = Arrays.copyOf(enemy, enemy.length + 1);
			// �����ɵĵл�����������������λ��
			enemy[enemy.length - 1] = f;
		}
		enemyIndex++;
	}
	public void bulletEnterAction() {
		
		// Ӣ�ۻ�����
		if (enemyIndex % 30 == 0) {
			Bullet[] bs=hero.shoot();
			bls=Arrays.copyOf(bls, bls.length+bs.length);
			System.arraycopy(bs, 0, bls, bls.length-bs.length, bs.length);
		}
	}
	// �������һ�ܵл��ķ���
	public FlyingObject makeEnemy() {

		FlyingObject fly = null;
		Random random = new Random();
		int num = random.nextInt(100);
		if (num < 40) {
			fly = new Airplane();

		} else if (num < 80) {
			fly = new BigAirplane();
		} else {
			fly = new Bee();
		}
		// ����һ��0~99�������
		return fly;
	}

	// ���ƴ������շ���
	@Override
	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].paintObject(g);
		}

		for (int i = 0; i < bls.length; i++) {
			bls[i].paintObject(g);
		}
		
		
		g.setColor(Color.red); 
        Font font=new Font("����",Font.PLAIN,30);  
        g.setFont(font); 
		fpsMaker.makeFPS();
		if (enemyIndex % (1000/INTERVAL/10+1) == 0)
			fps=fpsMaker.getFPS();
		g.drawString("FPS:"+fps, 10, 30);
	}
	
	public static void main(String[] args) {

		World w = new World();
		// ʵ����һ���������
		JFrame jf = new JFrame("�ɻ���ս");
		// ��world�������봰�����
		jf.add(w);
		// ���ô���Ŀ��
		jf.setSize(400, 700);
		// ���õ����Ͻǲ�ʱͬʱ��������
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ó���λ�þ���
		jf.setLocationRelativeTo(null);
		// ��ʾ����,��ʾ����ͬʱ����paint����
		jf.setVisible(true);

		w.start();
	}

}