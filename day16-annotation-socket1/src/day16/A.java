package day16;

public class A {
	public void a() {
		System.out.println("ºÃàËßÏ");
	}
	
	@Test(id = 1,title = "²âÊÔ1")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(id = 2)
	public void test2() {
		System.out.println("test2");
	}
	
	public void test3() {
		System.out.println("test3");
	}
	
	@Test("²âÊÔ3")
	public void test4() {
		System.out.println("test4");
	}
}
