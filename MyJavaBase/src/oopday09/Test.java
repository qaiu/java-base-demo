package oopday09;

interface In1 {
	void fun();
}

interface In2{
	void fun();
}

class My implements In1,In2{
	public void fun() {
		System.out.println("Ok");
	}
}

public class Test{
	public static void main(String[] args) {
		new My().fun();
		
		new In1() {
			public void fun() {
				System.out.println("123");
			}
		}.fun();
		
		Runnable r = ()->System.out.println("hello,lambda");
		r.run();
		In1 in = () -> System.out.println("111");
		in.fun();
	}
}