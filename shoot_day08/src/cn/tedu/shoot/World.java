package cn.tedu.shoot;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
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
	
	// ˢ�¼��
	public static final int INTERVAL = 5;
	
	// ��Ϸ״̬
	public static final int START = 0;
	public static final int RUNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	
	// ��Ϸ��ǰ״̬
	private int state = START;
	
	// ��������ͼƬ
	private static BufferedImage startImg;
	private static BufferedImage pauseImg;
	private static BufferedImage overImg;

	Hero hero = new Hero();
	Sky sky = new Sky();
	
	private int score=0;

	FlyingObject[] enemy = {}; //�л�����
	Bullet[] bls = {}; // �ӵ�����

	static CFPSMaker fpsMaker;
	static String fps;
	static {
		
		// ��ʼ��fpsͳ��
		fpsMaker = new CFPSMaker();
		fpsMaker.setNowFPS(System.nanoTime());
		fpsMaker.makeFPS();
		
		startImg=FlyingObject.readImage("start.png");
		pauseImg=FlyingObject.readImage("pause.png");
		overImg=FlyingObject.readImage("gameover.png");
	}
	
	public void start() {
		// ���������� �����ڲ������
		MouseAdapter l=new MouseAdapter() {
			// ����ƶ�ʱ�����ķ���
			@Override
			public void mouseMoved(MouseEvent e) {
				// ����������λ��
				int x=e.getX();
				int y=e.getY();
				if (x<WIDTH&&y<HEIGHT) {
					
					hero.moveTo(x, y);
				}
			}
			
		};

		// ע������ƶ��¼�������϶��¼�
		this.addMouseMotionListener(l);
		this.addMouseListener(l);
		
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
				checkOutAction();
				bulletHitAction();
				heroHitAction();
				repaint();

			}
		};
		timer.schedule(task, 0, interval);
	}
	
	//����ӵ��͵л���ײ�ķ���
	public void bulletHitAction() {
		// ѭ�������ӵ�����
		for(int i = 0; i < bls.length; i++) {
			Bullet b = bls[i];
			// �������ел�
			for (int j = 0; j < enemy.length; j++) {
				FlyingObject f=enemy[j];
				//�ж���ײ
				if (b.isLife() && f.isLife() && b.hit(f)) {
					b.goDead();
					f.goDead();
					if(f instanceof Score) {
						//���f��ʵ����Score�ӿڵĶ���
						Score s = (Score)f;//**ǿ������ת����Score
						score += s.getScore();//**�ӷ�
					}
					//������е���С�۷�
					if(f instanceof Award) {
						//ǿ������ת��
						Award a=(Award)f;
						int type=a.getAward();//��ý������͵�ֵ
						switch(type) {//��ʼ��֧�ж�
						case Award.DOUBLE_FIRE://����ǽ�������ֵ
						//	hero.addDoubleFire();//Ӣ�ۻ��ӻ���ֵ
							break;
						case Award.LIFE://�����������ֵ
							hero.addLife();//Ӣ�ۻ�������ֵ
							break;
						}
					}
				}
			}
		}
	}

	//Ӣ�ۻ��͵л�����ײ���
	public void heroHitAction() {
		//�������ел�
		for(int i=0;i<enemy.length;i++) {
			//ȡ����ǰ�л�
			FlyingObject f=enemy[i];
			//����Ƿ�������ײ
			if(hero.isLife() && f.isLife() && f.hit(hero)) {
				//�л���
				f.goDead();
				hero.subLife();//Ӣ�ۻ�����
			//	hero.clearDoubleFire();//Ӣ�ۻ���ջ���
			}
		}
	}

	public void checkOutAction() {
		// �����������Ҫ����������
		int index=0;
		// ����һ����ԭ���鳤��һ�µ������� ���û�г���ĵл�
		FlyingObject[] flive=new FlyingObject[enemy.length];
		for (int i = 0; i < enemy.length; i++) {
			// ȡ����ǰ�л�
			FlyingObject f=enemy[i];
			// �����ܵл��Ƿ�û���粢��û�Ƴ�
			if (!f.outOfBounds()&&!f.isRemove()) {
				// ����ܵл�����������
				flive[index++]=f;
			}
		}
		// �������鰴�մ��ĵл���������
		enemy=Arrays.copyOf(flive, index);
		index = 0;
		Bullet[] blive=new Bullet[bls.length];
		for (int i = 0; i < blive.length; i++) {
			Bullet b=bls[i];
			if (!b.outOfBounds()&!b.isRemove()) {
				blive[index++] = b;
			}

		}

		bls=Arrays.copyOf(blive, index);

		//System.out.println(bls.length);
	}
	// �������ƶ�����
	public void moveAction() {
		// ����ƶ�
		sky.step(); 
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
		if (enemyIndex % 15 == 0) {
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
		if (enemyIndex % 50 == 0) {
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
        Font font=new Font(null,Font.PLAIN,30);  
        
        g.setFont(font); 
		fpsMaker.makeFPS();
		if (enemyIndex % (1000/INTERVAL/10+1) == 0)
			fps=fpsMaker.getFPS();
		g.drawString("FPS:"+fps, 10, 30);
		g.drawString("�÷֣�"+score, 10, 65);
		g.drawString("����ֵ��"+hero.getLife(), 10, 100);
		g.drawString("����ֵ��"+hero.getDoubleFire(), 10, 130);
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