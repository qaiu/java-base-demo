package object;
/**
 * ʹ�õ�ǰ�����Object��ط���
 * @author QAIU
 *
 */
public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		/*
		 * System.out.println(Object obj)
		 * �÷����������Ķ������������̨ʱ��
		 * ����øö����toString�����ص��ַ������
		 * ��Object�����toString���ص��ַ���
		 * ��ʽ������@��ַ
		 * �����ʵ��Ӧ�������岻��.
		 */
		System.out.println(p);
		/*
		 * �κ��������ͺ��ַ������ӽ�������ַ���
		 * ��java����ʱʵ�ʲ����ǵ�����toString����
		 * �����ص��ַ������ַ������ӵ�
		 */
		String str = "point:" + p;
		System.out.println(str);
		
		Point p2 = new Point(1, 2);	
		/*
		 * �����������Ͷ��ԣ������ж���������ַ�ʽ����һ����"=="
		 * "=="��Ϊ��ֵ�жϣ��ǱȽ�����������ֵ�Ƿ����
		 * �����������Ͷ��ԣ���������ǵ�ַ�����Ե�"=="Ϊtrueʱ
		 * ˵����������ָ�����ͬһ������
		 */
		System.out.println(p==p2);//false
		
		/*
		 * �ڶ�����"equals"����
		 * equals������Object����ķ�����
		 * �����ͼ�ǱȽ������������ͱ���ָ��Ķ���"�������"
		 * ���Ǹ÷�����Ҫ��д����ΪObject�ṩ�ĸ÷����ڲ�ʹ��"=="�Ƚϵ�
		 * ����дû���κ�����
		 */
		System.out.println(p.equals(p2));//true
	
		Integer aInteger;
		
		
		
	}
}
