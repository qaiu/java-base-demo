package bindemo;

public class Demo01 {
	public static void main(String[] args) {
		int i = 50;
		/*
		 * toBinaryString ������i���ڴ��д洢��
		 * 2����ʵ��λ��ת��Ϊ�ַ���
		 * 
		 * ����Ҫչʾһ���������ڴ���ʵ��2����
		 * ���ʱ��͵����������
		 */
		// ����ʱ�� ��ʮ����50תΪ2����
		// ��������ڼ� i���ڴ�����2����
		System.out.println(Integer.toBinaryString(i));
		/*
		 * i���ڴ��о���2���Ƶ� 110010
		 * ��println�������ʱ�� �Զ������� 
		 * Integer.toString()
		 * ��2����תΪ10�����ַ���
		 */
		for (int j = 0; j < 150; j++) {
			System.out.println(Integer.toBinaryString(j));
		}
	}
}
