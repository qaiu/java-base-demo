package integer;

/**
 * 包装类有一个非常实用的功能
 * 就是可以将字符串解析成对应的基本类型
 * 但是前提是字符串内容
 * 正确描述了基本类型可以保存的值
 * @author QAIU
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		String str = "123";
		int d = Integer.parseInt(str);
		System.out.println(d);

		double dou = Double.parseDouble(str);
		System.out.println(dou);
		
		
	}
}
