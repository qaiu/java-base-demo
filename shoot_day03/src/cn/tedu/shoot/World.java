package cn.tedu.shoot;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{
	
	Hero hero=new Hero();
	Sky sky=new Sky();
	
	FlyingObject[] enemy=new FlyingObject[6];
	Bullet[] bls=new Bullet[3];
	public void start() {
		System.out.println("测试测试阿萨德阿斯蒂测试ad芬飞测试中文显示");
	}
	
	public static void main(String[] args) {
		World w=new World();
		// 实例化一个窗体对象
		JFrame jf=new JFrame("飞机大战");
		// 将world类对象放入窗体管理
		jf.add(w);
		// 设置窗体的宽高
		jf.setSize(400,700);
		// 设置点右上角叉时同时结束程序
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置出现位置居中
		jf.setLocationRelativeTo(null);
		// 显示窗体
		jf.setVisible(true);
		
		w.start();
	}

}