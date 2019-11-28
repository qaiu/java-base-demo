package oopday01;

public class Myoop {

	public static void main(String[] args) {
		OOP oop=new OOP(33, null);
		OOP oop1=new OOP(0, null);
		System.out.println(oop);
		//oop1=oop;
		System.out.println(oop+"\n"+oop1);
		System.out.println(oop1.a);
		OOP[] o = new OOP[]{new OOP(),new OOP(),new OOP()};
		System.out.println(o);
		System.out.println(o[0]);
		
	}

	
	public Myoop() {
		// TODO 自动生成的构造函数存根
	}
}
