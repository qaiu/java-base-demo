package string;
/**
 * String ReplaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分，替换成指定的内容
 * @author QAIU
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * 将字符串的数组部分替换成"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
