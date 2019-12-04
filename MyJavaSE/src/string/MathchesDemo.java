package string;
/**
 * 字符串正则表达式方法一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否符合格式要求
 * 符合返回true
 * 注：给定的正则表达式无论是否加了边界匹配
 * 都是做全匹配验证的
 * @author QAIU
 *
 */
public class MathchesDemo {
	public static void main(String[] args) {
		String mail = "a_sad@qq.com.cn";
		String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = mail.matches(regex);
		if (match) {
			System.out.println("这是邮箱");
		} else {
			System.out.println("这不是邮箱");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
