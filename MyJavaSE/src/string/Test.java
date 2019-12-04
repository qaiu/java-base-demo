package string;
/**
 * 实现方法，完成获取域名的操作
 * @author QAIU
 *
 */
public class Test {
	public static void main(String[] args) {
		String name = getHostName("www.baidu.com");
		System.out.println(name);//baidu
		name = getHostName("www.tedu.cn");
		System.out.println(name);//tedu
	}
	public static String getHostName(String loc) {
		int start = loc.indexOf(".") + 1;
		int end = loc.indexOf(".",start);
		String s = loc.substring(start,end);
		return s;
	}
}
