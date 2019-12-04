package string;
/**
 * boolean startWith(String str)
 * boolean endWith(String str)
 * 判断当前字符串是否是以给定的字符串开始或者结尾的
 * @author QAIU
 *
 */
public class StartWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("think");
		System.out.println("starts:"+starts);
		
		boolean ends = str.endsWith("ava");
		System.out.println("ends:"+ends);
	}
}
