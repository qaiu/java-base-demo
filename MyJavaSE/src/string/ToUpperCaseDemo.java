package string;
/**
 * String toUpperCase()
 * String toLowerCase()
 * 将字符串中的英文部分转换为全大写或者全小写
 * @author QAIU
 *
 */
public class ToUpperCaseDemo {
	public static void main(String[] args) {
		String str = "我爱Java";
		System.out.println(str);
		String upper = str.toUpperCase();
		System.out.println(upper);
		String lower = str.toLowerCase();
		System.out.println(lower);
	}
}
