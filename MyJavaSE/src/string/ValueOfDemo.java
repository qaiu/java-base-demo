package string;
/**
 * String�ṩ��һ�龲̬����valueOf
 * ���Խ�����������תΪ�ַ�����
 * ���õ��ǽ���������תΪ�ַ���
 * @author QAIU
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int a = 123;
		String s = String.valueOf(a);
		System.out.println(s);
		
		double dou = 123.123;
		s = String.valueOf(dou);
		System.out.println(dou);
		
		s = a + "";
		System.out.println(s);
	}
}
