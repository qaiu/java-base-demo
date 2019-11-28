package bindemo;

public class Demo5 {
	public static void main(String[] args) {
		int n = 0x77d2b8ba;
		int m = n >>> 1;
		int k = n >>> 2;
		int g = n >>> 8;

		int b4 = n & 0xff;
		int b3 = (n>>>8) & 0xff;
		int b2 = (n>>>16) & 0xff;
		int b1 = (n>>>24) & 0xff;

		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(g));
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b1));
	}
}
