package string;
/**
 * 字符串支持正则表达式方法二
 * String[] split(String regex)
 * 将当前字符串按照符合正则表达式内容拆分
 * @author QAIU
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String s = "111AS324A43SA6a8980s89dfa00s8g3x111111111111";
		//按照数字部分拆分，保留字母部分
		String[] data = s.split("\\d");
		System.out.println(data.length);
		for (String string : data) {
			System.out.println(string);
		}
	}
}
