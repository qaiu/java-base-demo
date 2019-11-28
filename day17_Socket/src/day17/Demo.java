package day17;


class A{
	static {
		System.out.println("A");
	}
	{
		System.out.println("kA");
	}
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("mA");
	}
}

class B extends A{
	static {
		System.out.println("B");
	}
	{
		System.out.println("kB");
	}
	public B() {
		// TODO Auto-generated constructor stub
		
		System.out.println("mB");
	}
}
public class Demo {
	
	public static void main(String[] args) throws Exception {
		A aa;
		
	}
}
