package string;
/**
 * �ַ���������ʽ����һ��
 * boolean matches(String regex)
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ���ϸ�ʽҪ��
 * ���Ϸ���true
 * ע��������������ʽ�����Ƿ���˱߽�ƥ��
 * ������ȫƥ����֤��
 * @author QAIU
 *
 */
public class MathchesDemo {
	public static void main(String[] args) {
		String mail = "a_sad@qq.com.cn";
		String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = mail.matches(regex);
		if (match) {
			System.out.println("��������");
		} else {
			System.out.println("�ⲻ������");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
