package string;

/**
 * StringƵ���޸Ĵ��������ܿ���
 * @author QAIU
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "";
		System.out.println(str);
		/*
		 * �����ַ����ǲ������ÿ���޸����ݶ���
		 * Ƶ������������������������ж��ַ���
		 * Ƶ��ƴ�Ӳ���ʱ�����ܲ����
		 * ��ˣ��ַ���String���ʺ�Ƶ���޸�����
		 */
		for (int i = 0; i < 10000000; i++) {
			str += "a";
		}
		System.out.println("over");
	}
}
