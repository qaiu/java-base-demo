package bindemo;

public class Demo4 {
	public static void main(String[] args) {
		int n = 0x77d2b8ba;
		int m = 0xff;
		int k = n&m;

		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.printf("%x", k);
	}
}
