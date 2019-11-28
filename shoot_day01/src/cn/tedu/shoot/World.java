package cn.tedu.shoot;

public class World {
	
	public static void main(String[] args) {
		Airplane a1=new Airplane(50, 40, 150, 320, 4);
		a1.show();
		
		Bee b1=new Bee(30, 30, 0, 0, 0, 0);
		b1.show();
		
		BigAirplane big=new BigAirplane(50, 50, 0, 0, 3);
		big.show();
		
		Bullet bu=new Bullet(5, 5, 50, 50, 10);
		bu.show();
		
		Hero he=new Hero(50, 50, 6, 6, 3, 0);
		he.show();
		
		Sky sky=new Sky(400, 700, 0, 0, 1, 400);
		sky.show();
	}

}
