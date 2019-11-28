package oopday09.work;

abstract class TrallicTool {
	public abstract void run();
}

class Train extends TrallicTool{
	@Override
	public void run() {
		System.out.println("火车在轨道上行驶");
	}
	public void changWay() {
		System.out.println("火车更换了轨道");
	}
}

class Boat extends TrallicTool{
	@Override
	public void run() {
		System.out.println("船在水面上行驶");
	}
	public void boatStop() {
		System.out.println("船停止行驶");
	}
}

public class Demo{
	public static void main(String[] args) {
		TrallicTool[] tl= {
				new Train(),
				new Boat(),
				new Train(),
				new Boat()
		};
		for (int i = 0; i < tl.length; i++) {
			if (tl[i] instanceof Train) {
				Train train=(Train)tl[i];
				train.changWay();
			}
			if (tl[i] instanceof Boat) {
				Boat boat=(Boat)tl[i];
				boat.boatStop();
			}
			tl[i].run();
		}
	}
}