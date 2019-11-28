package cn.tedu.shoot;

import java.awt.image.BufferedImage;

//小敌机类
public class Airplane extends FlyingObject{
	//定义保存小敌机需要图片的数组
	
	private static BufferedImage[] images;
	// 静态块，在加载本类时，对图片数组赋值
	static {
		images= new BufferedImage[5];
		// 为数组元素赋值
		images[0]=readImage("airplane0.png");
		for (int i = 1; i < images.length; i++) {
			images[i]=readImage("bom"+i+".png");
		}
	}
	
	//小敌机的属性
	int step; // 速度
	
	public Airplane() {
		super(48, 50);
		step=4;
	}
	//小敌机的输出方法
	public void show() {
		System.out.println("宽:"+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("速度:"+step);
	}
	
	int index=1;
	// 重写父类的抽象方法
	@Override
	public BufferedImage getImage() {
		BufferedImage img = null;
		// 如果小敌机活着
		if (isLife()) {
			// 返回小敌机图片
			img=images[0];
		}else if (isDead()) {
			// 获得一张爆炸图片
			img=images[index++];
			// 如果是最后一张图片 
			if (index>=images.length) {
				// 将状态改为移除
				state=REMOVE;
			}
		}
		return img;
	}
	// 重写父类的抽象方法
	@Override
	public void step() {
		y+=step;
	}
}
