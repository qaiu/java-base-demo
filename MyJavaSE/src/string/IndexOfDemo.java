package string;
/**
 * int indexOf(String str)
 * ���������ַ����ڵ�ǰ�ַ�����λ��
 * ����ǰ�ַ�����������������ʱ����-1
 * @author QAIU
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		// 
		String str = "thinking in java";
		
		int index = str.indexOf("in"); 
		System.out.println(index);
		//��ָ��λ�ÿ�ʼ���ҵ�һ�γ��ֵ�λ��
		index = str.indexOf("in",3);
		System.out.println(index);
		//�������һ�γ��ָ����ַ�����λ��
		index = str.lastIndexOf("in");
		System.out.println(index);
	}

}
