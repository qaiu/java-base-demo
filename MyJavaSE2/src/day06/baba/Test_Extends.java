package day06.baba;

public class Test_Extends {
	public static void main(String[] args) {
//		Father f = new Father();
		Son s = new Son();
		s.eat();
		System.out.println(s.country);
	}
}


class Father{
	String country;
	public void eat(){
		System.out.println("°Ö°ÖÔÚ³Ô·¹");
	}
	public static void test() {
		System.out.println("static father");
	}
}

class Son extends Father{
	String country;
	
	{
		super.test();
		country = super.country;
	}
	public Son() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static void test() {
		System.out.println("static son");
	}
}