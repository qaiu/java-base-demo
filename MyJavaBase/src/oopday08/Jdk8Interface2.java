package oopday08;

public interface Jdk8Interface2 {
	public abstract void test();

	public default void test1() {
		System.out.println("test1");
	}
	public static void test2() {
		System.out.println("test2");
	}
}
