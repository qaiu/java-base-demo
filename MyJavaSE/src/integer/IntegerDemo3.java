package integer;
/**
 * JDK1.5�Ƴ���һ�������ԣ��Զ���װ��
 * �������������ǿ�����Դ�����п����û����������Ӧ��
 * ��װ��֮���໥��ֵʹ�� ������Ӷ����ת��������
 * ���Ǹ������Ǳ������Ͽɵģ�ʵ���ϱ����ڽ�Դ����
 * ����Ϊclass�ļ�ʱ�����ת������
 * @author QAIU
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		// �Զ���װ��
		/*
		 * ����ᴥ�����������Զ���װ������
		 * ���������ڱ����ڼ佫��װ��ת��Ϊ��������
		 * ���������Ϊ��
		 * int a = new Integer(1).intValue()
		 */
		int a = new Integer(1);
		/*
		 * ���ﴥ���Զ�װ�����ԣ���������Ĵ���Ϊ��
		 * Integer i = Integer.valueOf(a)
		 */
		Integer i = a;
		System.out.println(i);
		
	}
}
