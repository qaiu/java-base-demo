package oopday01;

import java.util.Scanner;
public class MethodDome {

	static Scanner scanner = new Scanner(System.in);
	
	public static void calcRound() {
		
		System.out.println("������뾶��");
		double r=scanner.nextDouble();
		double s=3.14*r*r;
		System.out.println("���Ϊ"+s);
	}
	public static<T> T name(T a) {
		return a;
	}
	public static void func() {
		
	}
	public static void main(String[] args) {
	
		name(12.34);
		name(111);
	}

}
