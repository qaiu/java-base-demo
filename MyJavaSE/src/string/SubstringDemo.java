package string;
/**
 * String substring(int Start,int end)
 * ��ȡָ����Χ�ڵ��ַ���
 * ע��java APIͨ��ʹ������������Ϊ��Χʱ
 * ���ǡ���ͷ����β����
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
