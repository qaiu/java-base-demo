package oopday09.work;

abstract class TrallicTool {
	public abstract void run();
}

class Train extends TrallicTool{
	@Override
	public void run() {
		System.out.println("���ڹ������ʻ");
	}
	public void changWay() {
		System.out.println("�𳵸����˹��");
	}
}

class Boat extends TrallicTool{
	@Override
	public void run() {
		System.out.println("����ˮ������ʻ");
	}
	public void boatStop() {
		System.out.println("��ֹͣ��ʻ");
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