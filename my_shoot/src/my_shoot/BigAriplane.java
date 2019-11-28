package my_shoot;

import java.awt.image.BufferedImage;

public class BigAriplane extends FlyingObject{
	//定义保存小敌机所需图片的数组
		private static BufferedImage[] images;
		//静态块 加载本类时 对图片数组赋值
		static {
			// 一张飞机图片 四张爆炸图片 一共五张
			images = new BufferedImage[5];
			images[0] = readImage("bigairplane0.png");
			for (int i = 1; i < images.length; i++) {
				images[i] = readImage("bom"+i+".png"); 
			}
		}
		
		// 小敌机属性
		int step;
		int index=1;
		public BigAriplane() {
			super(66, 89);
			this.step = 2;
		}
		
		@Override
		public BufferedImage getImage() {
			BufferedImage img = null;
			if (isLift()) {
				img=images[0];
			} else if (isDead()) {
				img=images[index++];
				if (index>+images.length) {
					//状态改为移除
					state=REMOVE;
				}
			}
			return img;
		}
}
