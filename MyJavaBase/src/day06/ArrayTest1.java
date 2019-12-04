package day06;

public class ArrayTest1 {
	public static void main(String[] argc) {
		
		//System.out.println(arr.length);
		String string="ÄãºÃ";
		
		//System.out.println(string.length());
		byte []b=new byte[4];
		b=string.getBytes();
		for (byte c : b) {
			System.out.printf("%02x\n",c);
		}
		
		char[] chs=new char[2];
		chs[0]='Äã';
		chs[1]='ºÃ';
		for (char c : chs) {
			System.out.printf("%x\n",c+0);
		}
		int a=12;
		a*=1+1;
		System.out.println(a);
	}
}
