package string;
/**
 * ʵ�ַ�������ɻ�ȡ�����Ĳ���
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
