package my_shoot;

import java.awt.image.BufferedImage;

public class Bee extends FlyingObject{
	private static BufferedImage images[];
	static {
		images=new BufferedImage[5];
		images[0]=readImage("bee0.png");
		
		for (int i = 1; i < images.length; i++) {
			images[i]=readImage("bom"+i+".png");
		}
	}
	
	private int xStep;
	private int yStep;
	private int index;

	public Bee() {
		super(60,51);
		xStep = 2;
		yStep = 2;
	}
	
	@Override
	public BufferedImage getImage() {
		BufferedImage img = null;
		if (isLift()) {
			img=images[0];
		} else if (isDead()) {
			img=images[index++];
			if (index>+images.length) {
				//×´Ì¬¸ÄÎªÒÆ³ý
				state=REMOVE;
			}
		}
		return img;
	}
}
