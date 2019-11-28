package string;
/**
 * String substring(int Start,int end)
 * 截取指定范围内的字符串
 * 注：java API通常使用两个数字作为范围时
 * 都是“含头不含尾”。
 * @author QAIU
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		String hoString = "www.tedu.cn";
		String sub = hoString.substring(4,8);
		System.out.println(sub);
		sub = hoString.substring(4);
		System.out.println(sub);
	}
}
