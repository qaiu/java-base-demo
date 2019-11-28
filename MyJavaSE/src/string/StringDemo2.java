package string;

/**
 * String频繁修改带来的性能开销
 * @author QAIU
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "";
		System.out.println(str);
		/*
		 * 由于字符串是不变对象，每次修改内容都会
		 * 频繁创建对象，如果开发需求中有对字符串
		 * 频繁拼接操作时，性能差开销大
		 * 因此：字符串String不适合频繁修改内容
		 */
		for (int i = 0; i < 10000000; i++) {
			str += "a";
		}
		System.out.println("over");
	}
}
