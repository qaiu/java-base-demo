package string;
/**
 * �ַ���֧��������ʽ������
 * String[] split(String regex)
 * ����ǰ�ַ������շ���������ʽ���ݲ��
 * @author QAIU
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String s = "111AS324A43SA6a8980s89dfa00s8g3x111111111111";
		//�������ֲ��ֲ�֣�������ĸ����
		String[] data = s.split("\\d");
		System.out.println(data.length);
		for (String string : data) {
			System.out.println(string);
		}
	}
}
