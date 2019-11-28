package day15;

import day15.A.Inaer2;
import day15.A.Inner1;

public class Test5 {
	public static void main(String[] args) {
		Inner1 i1 = new Inner1();
		System.out.println(i1);
		A a = new A();
		Inaer2 i2 = a.new Inaer2();
		System.out.println(i2);
	}
}

class A{
	static class Inner1{}
	class Inaer2{}
}
