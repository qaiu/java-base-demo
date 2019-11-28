package string;
/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串的位置
 * 若当前字符串不包含给定内容时返回-1
 * @author QAIU
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		// 
		String str = "thinking in java";
		
		int index = str.indexOf("in"); 
		System.out.println(index);
		//从指定位置开始查找第一次出现的位置
		index = str.indexOf("in",3);
		System.out.println(index);
		//查找最后一次出现给定字符串的位置
		index = str.lastIndexOf("in");
		System.out.println(index);
	}

}
