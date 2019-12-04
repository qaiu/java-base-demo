package integer;
/**
 * ��װ��
 * ��װ����Ϊ�˽���������Ͳ���ֱ��������󿪷���������
 * �����û������Ϳ����Զ������ʽ����
 * @author QAIU
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int a = 128;
		//��������ת��Ϊ��Ӧ�İ�װ��
		//Integer i1 = new Integer(a);
		//Integer i2 = new Integer(a);
		
		//java����ʹ��valueofת��
		Integer i1 = Integer.valueOf(a);
		Integer i2 = Integer.valueOf(a);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		//��װ��ת��Ϊ��������
		int d = i1.intValue();
		System.out.println(d);
		double dou = i1.doubleValue();
		System.out.println(dou);
		float f = i1.floatValue();
		System.out.println(f);
		byte b = i1.byteValue();
		System.out.println(b);
		/*
		 * �����������͵İ�װ�඼������������
		 * MAX_VALUE��MIN_VALUE
		 * ������¼�������͵�ȡֵ��Χ
		 */
		//��ȡint���ֵ
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
		double dmax = Double.MAX_VALUE;
		System.out.println(dmax);
	}
}
