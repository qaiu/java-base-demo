package oopday09;


interface WriteAble{
	void write();
}

class Pen implements WriteAble{
	public void addInk() {
		System.out.println("¸Ö±ÊÎüÄ«Ö­");
	}
	@Override
	public void write() {
		System.out.println("¸Ö±ÊÐ´×Ö");
	}
}
class Pencil implements WriteAble{
	public void makeSharp() {
		System.out.println("Ç¦±ÊÏ÷¼â");
	}
	@Override
	public void write() {
		System.out.println("Ç¦±ÊÐ´×Ö");
	}
}
public class TestDemo {
	public static void main(String[] args) {
		WriteAble[] w=new WriteAble[3];
		w[0]=new Pen();
		w[1]=new Pencil();
		w[2]=new Pen();
		
		for (WriteAble writeAble : w) {
			if (writeAble instanceof Pen) {
				Pen p=(Pen)writeAble;
				p.addInk();
			}
			if (writeAble instanceof Pencil) {
				Pencil p=(Pencil)writeAble;
				p.makeSharp();
			}
			writeAble.write();
		}
	}
}
