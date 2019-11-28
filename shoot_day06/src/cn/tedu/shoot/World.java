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
	// 宽和高的常量
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
		
		// 初始化fps统计
		fpsMaker = new CFPSMaker();
		fpsMaker.setNowFPS(System.nanoTime());
		fpsMaker.makeFPS();
	}
	
	public void start() {
		// 编写计时器
		Timer timer = new Timer();
		// 定义时间间隔
		int interval = INTERVAL;
		// 编写计时器周期运行的内容
		// 匿名内部类来实现
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// 由计时器周期调用的方法
				moveAction();
				enemyEnterAction();

				bulletEnterAction();
				repaint();

			}
		};
		timer.schedule(task, 0, interval);
	}

	// 飞行物移动方法
	public void moveAction() {
		sky.step(); // 天空移动
	

		// 所有敌机移动
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].step();
		}
		// 所有子弹移动
		for (int i = 0; i < bls.length; i++) {
			bls[i].step();
		}
	}

	int enemyIndex = 1;

	// 敌机进场的方法
	public void enemyEnterAction() {
		// 生成一架敌机
		if (enemyIndex % 50 == 0) {
			FlyingObject f = makeEnemy();
			// 把当前敌机数组扩容1
			enemy = Arrays.copyOf(enemy, enemy.length + 1);
			// 将生成的敌机放入扩容数组的最后位置
			enemy[enemy.length - 1] = f;
		}
		enemyIndex++;
	}
	public void bulletEnterAction() {
		
		// 英雄机开炮
		if (enemyIndex % 30 == 0) {
			Bullet[] bs=hero.shoot();
			bls=Arrays.copyOf(bls, bls.length+bs.length);
			System.arraycopy(bs, 0, bls, bls.length-bs.length, bs.length);
		}
	}
	// 随机生成一架敌机的方法
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
		// 生成一个0~99的随机数
		return fly;
	}

	// 绘制窗体最终方法
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
        Font font=new Font("黑体",Font.PLAIN,30);  
        g.setFont(font); 
		fpsMaker.makeFPS();
		if (enemyIndex % (1000/INTERVAL/10+1) == 0)
			fps=fpsMaker.getFPS();
		g.drawString("FPS:"+fps, 10, 30);
	}
	
	public static void main(String[] args) {

		World w = new World();
		// 实例化一个窗体对象
		JFrame jf = new JFrame("飞机大战");
		// 将world类对象放入窗体管理
		jf.add(w);
		// 设置窗体的宽高
		jf.setSize(400, 700);
		// 设置点右上角叉时同时结束程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置出现位置居中
		jf.setLocationRelativeTo(null);
		// 显示窗体,显示窗体同时调用paint方法
		jf.setVisible(true);

		w.start();
	}

}