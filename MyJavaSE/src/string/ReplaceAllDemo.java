package string;
/**
 * String ReplaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ��֣��滻��ָ��������
 * @author QAIU
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * ���ַ��������鲿���滻��"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
