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
	// 宽和高的常量
	public static final int WIDTH = 400;
	public static final int HEIGHT = 700;
	
	// 刷新间隔
	public static final int INTERVAL = 5;
	
	// 游戏状态
	public static final int START = 0;
	public static final int RUNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	
	// 游戏当前状态
	private int state = START;
	
	// 定义三张图片
	private static BufferedImage startImg;
	private static BufferedImage pauseImg;
	private static BufferedImage overImg;

	Hero hero = new Hero();
	Sky sky = new Sky();
	
	private int score=0;

	FlyingObject[] enemy = {}; //敌机数组
	Bullet[] bls = {}; // 子弹数组

	static CFPSMaker fpsMaker;
	static String fps;
	static {
		
		// 初始化fps统计
		fpsMaker = new CFPSMaker();
		fpsMaker.setNowFPS(System.nanoTime());
		fpsMaker.makeFPS();
		
		startImg=FlyingObject.readImage("start.png");
		pauseImg=FlyingObject.readImage("pause.png");
		overImg=FlyingObject.readImage("gameover.png");
	}
	
	public void start() {
		// 监听鼠标操作 匿名内部类对象
		MouseAdapter l=new MouseAdapter() {
			// 鼠标移动时触发的方法
			@Override
			public void mouseMoved(MouseEvent e) {
				// 获得鼠标坐标位置
				int x=e.getX();
				int y=e.getY();
				if (x<WIDTH&&y<HEIGHT) {
					
					hero.moveTo(x, y);
				}
			}
			
		};

		// 注册鼠标移动事件和鼠标拖动事件
		this.addMouseMotionListener(l);
		this.addMouseListener(l);
		
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
				checkOutAction();
				bulletHitAction();
				heroHitAction();
				repaint();

			}
		};
		timer.schedule(task, 0, interval);
	}
	
	//检测子弹和敌机碰撞的方法
	public void bulletHitAction() {
		// 循环遍历子弹数组
		for(int i = 0; i < bls.length; i++) {
			Bullet b = bls[i];
			// 遍历所有敌机
			for (int j = 0; j < enemy.length; j++) {
				FlyingObject f=enemy[j];
				//判断碰撞
				if (b.isLife() && f.isLife() && b.hit(f)) {
					b.goDead();
					f.goDead();
					if(f instanceof Score) {
						//如果f是实现了Score接口的对象
						Score s = (Score)f;//**强制类型转换成Score
						score += s.getScore();//**加分
					}
					//如果击中的是小蜜蜂
					if(f instanceof Award) {
						//强制类型转换
						Award a=(Award)f;
						int type=a.getAward();//获得奖励类型的值
						switch(type) {//开始分支判断
						case Award.DOUBLE_FIRE://如果是奖励火力值
						//	hero.addDoubleFire();//英雄机加火力值
							break;
						case Award.LIFE://如果奖励生命值
							hero.addLife();//英雄机加生命值
							break;
						}
					}
				}
			}
		}
	}

	//英雄机和敌机的碰撞检测
	public void heroHitAction() {
		//遍历所有敌机
		for(int i=0;i<enemy.length;i++) {
			//取出当前敌机
			FlyingObject f=enemy[i];
			//检查是否发生了碰撞
			if(hero.isLife() && f.isLife() && f.hit(hero)) {
				//敌机死
				f.goDead();
				hero.subLife();//英雄机减命
			//	hero.clearDoubleFire();//英雄机清空火力
			}
		}
	}

	public void checkOutAction() {
		// 运算过程中需要的索引常量
		int index=0;
		// 定义一个和原数组长度一致的新数组 存放没有出界的敌机
		FlyingObject[] flive=new FlyingObject[enemy.length];
		for (int i = 0; i < enemy.length; i++) {
			// 取出当前敌机
			FlyingObject f=enemy[i];
			// 检查这架敌机是否没出界并且没移除
			if (!f.outOfBounds()&&!f.isRemove()) {
				// 将这架敌机放入新数组
				flive[index++]=f;
			}
		}
		// 将新数组按照存活的敌机数量缩容
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
	// 飞行物移动方法
	public void moveAction() {
		// 天空移动
		sky.step(); 
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
		if (enemyIndex % 15 == 0) {
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
		if (enemyIndex % 50 == 0) {
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
        Font font=new Font(null,Font.PLAIN,30);  
        
        g.setFont(font); 
		fpsMaker.makeFPS();
		if (enemyIndex % (1000/INTERVAL/10+1) == 0)
			fps=fpsMaker.getFPS();
		g.drawString("FPS:"+fps, 10, 30);
		g.drawString("得分："+score, 10, 65);
		g.drawString("生命值："+hero.getLife(), 10, 100);
		g.drawString("火力值："+hero.getDoubleFire(), 10, 130);
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