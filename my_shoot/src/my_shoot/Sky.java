package my_shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject {
	private static BufferedImage image;
	static {
		image=readImage("background0.png");
	}
	
	private int step;
	private int y1;
	
	public Sky() {
		super(400, 700, 0, 0);
		y1=-700;
	}
	@Override
	public BufferedImage getImage() {
		return image;
	}
	@Override
	public void paintObject(Graphics g) {
		g.drawImage(image, step, y, null);
		g.drawImage(image, step, y1, null);
	}
}
