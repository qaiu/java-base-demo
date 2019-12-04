package day03;

public class Test_medthod {
	public static void main(String[] args) {
		//方法传参
		medthod(); //方法调用
		medthod2(3);
		medthod3("a:", 5);
		System.out.println(medthod4(2, 3));
	}
	
	
	public static void medthod() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}
	
	public static void medthod2(int num) {
		System.out.println(num);
	}
	
	public static void medthod3(String s,int num) {
		System.out.println(s+num);
	}
	
	public static int medthod4(int a,int b) {
		
		return a+b;
	}
}
