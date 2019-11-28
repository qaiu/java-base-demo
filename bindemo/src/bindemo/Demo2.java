package bindemo;

public class Demo2 {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		byte b = Byte.MAX_VALUE;
		byte bb=b;
		b++;
		System.out.println(b);
		System.out.println(b>>2);
		//System.out.println(Integer.toBinaryString(b>>>2));
		
		for(int k = -150; k <= 0; k++) {
			System.out.println(Integer.toBinaryString(k)+","+k);
			System.out.println();
		}
		char c = '0';
		System.out.println(c+0);
	}
}
