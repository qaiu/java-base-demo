package oopday08;

public interface Jdk8Interface1 extends Jdk8Interface2,Jdk8Interface3{
	
	public abstract void test();
	public default void test1() {
		System.out.println("test1");
	}
	public static void test2() {
		System.out.println("test2");
	}
}
