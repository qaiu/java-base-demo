package string;
/**
 * char charAt(int index)
 * ��ȡ����λ���ϵ��ַ�
 * @author QAIU
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
