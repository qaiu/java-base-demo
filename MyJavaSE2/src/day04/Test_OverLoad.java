package day04;

//��������ڲ��Է�������overload
public class Test_OverLoad {
	public static void main(String[] args) {
		//�������أ���������ͬ+�����б�ͬ
		int a = 10;
		int b = 20;
		int c = 30;
		
		//��a b��
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
