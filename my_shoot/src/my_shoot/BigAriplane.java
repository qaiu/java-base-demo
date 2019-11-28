package my_shoot;

import java.awt.image.BufferedImage;

public class BigAriplane extends FlyingObject{
	//���屣��С�л�����ͼƬ������
		private static BufferedImage[] images;
		//��̬�� ���ر���ʱ ��ͼƬ���鸳ֵ
		static {
			// һ�ŷɻ�ͼƬ ���ű�ըͼƬ һ������
			images = new BufferedImage[5];
			images[0] = readImage("bigairplane0.png");
			for (int i = 1; i < images.length; i++) {
				images[i] = readImage("bom"+i+".png"); 
			}
		}
		
		// С�л�����
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
					//״̬��Ϊ�Ƴ�
					state=REMOVE;
				}
			}
			return img;
		}
}
