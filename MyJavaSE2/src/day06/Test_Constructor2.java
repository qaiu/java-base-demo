package day06;

import org.junit.Test;

public class Test_Constructor2 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.test2();
	}
}

class Animal{
	public String name = "Ð¡°×";
	public Animal() {
		
	};
	public Animal(String name) {
		this.name = name;
	}
	public void test2() {
		System.out.println("test2");
	}
	public static void test(int a) {
		System.out.println("this is Animal");
	}

}

class Cat  extends Animal{
	String name = "Ð¡ºÚ";
	
	public void test() {
		System.out.println(super.name);
		System.out.println("this is Cat");
	}
	
}