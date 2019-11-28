package day04;

//这个类用于测试方法重载overload
public class Test_OverLoad {
	public static void main(String[] args) {
		//方法重载：方法名相同+参数列表不同
		int a = 10;
		int b = 20;
		int c = 30;
		
		//求a b和
		add(a, b);
		add(a, b, c);
		
	}
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void add(int a, int  b, int c) {
		System.out.println(a+b+c);
	}
	
}
