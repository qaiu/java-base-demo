package code;

import java.io.UnsupportedEncodingException;

public class Test1_Encode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "12345ÖÐÎÄ";
		
		System.out.println("gbk:"+s.getBytes("gbk").length);
		System.out.println("utf-8:"+s.getBytes("utf-8").length);
		System.out.println("gb2312:"+s.getBytes("gb2312").length);
		System.out.println("unicode:"+s.getBytes("unicode").length);
		System.out.println("iso8859-1:"+s.getBytes("iso8859-1").length);
		System.out.println("ascii:"+s.getBytes("ascii").length);
		
	}
}
