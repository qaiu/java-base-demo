package cn.tedu.shoot;

public class World {
	Hero hero=new Hero();
	Sky sky=new Sky();
	Airplane[] as=new Airplane[3];
	BigAirplane[] bs=new BigAirplane[3];
	Bee[] bes = new Bee[3];
	
	public void start() {
		as[0]=new Airplane(50,40,120,200,4);
		as[1]=new Airplane(500,400,1200,2000,40);
		for (int i = 0; i < as.length; i++) {
			if (as[i]!=null) {
				as[i].show();
			}
		}
		
		bs[0]=new BigAirplane(30, 40, 40, 40, 5);
		bs[1]=new BigAirplane(60, 60, 50, 70, 4);
		bs[2]=new BigAirplane(130, 120, 30, 30, 5);
		for (BigAirplane b : bs) {
			if (b==null) {
				continue;
			}
			b.show();
		}
		bes[0]=new Bee(44, 66, 77, 88, 99, 11);
		bes[1]=new Bee(45, 67, 78, 84, 79, 1);
		bes[2]=new Bee(4354, 636, 773, 884, 949, 71);
		for (int i = 0; i < bes.length; i++) {
			bes[i].show();
		}
	}
	
	public static void main(String[] args) {
		World w=new World();
		w.start();
		
	}

}