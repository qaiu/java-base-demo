package string;
/**
 * java.lang.StringBuilder
 * ������ר�������޸��ַ�����API�����ڲ�ά����һ���ɱ�char����
 * ��˲�������޸�һ�ξʹ���һ���¶�������⣨�ڴ濪��С�����ܺã�
 * ����StringBuilder���ṩ���޸��ַ������ݵ�
 * һϵ�в���������ɾ���ģ���
 * @author QAIU
 *
 */
public class StringBuilerDemo {
	public static void main(String[] args) {
		String str = "Ŭ��ѧϰjava";
		//Ĭ��ʵ����������ʾһ�����ַ���
		//StringBuilder builder = new StringBuilder();
		StringBuilder builder = new StringBuilder(str);
		
		/*
		 * Ŭ��ѧϰjava
		 * Ŭ��ѧϰjava,Ϊ���Ҹ��ù���
		 */
		builder.append(",Ϊ���Ҹ��ù���");
		//����toString�������Ի���޸ĺ���ַ���
		str = builder.toString();
		System.out.println(str);
		/* 
		 * Ŭ��ѧϰjava,Ϊ���Ҹ��ù���
		 * Ŭ��ѧϰjava,����Ϊ�˸ı�����
		 */
		builder.replace(9, 16, "����Ϊ�˸ı�����");
		/*
		 * ���ʱֱ�����builderҲ����
		 * ��Ϊ��������ڲ������builder��toString����
		 * �����ص��ַ������
		 */
		System.out.println(builder);
		/*
		 * Ŭ��ѧϰjava,����Ϊ�˸ı�����
		 * ,����Ϊ�˸ı�����
		 */
		builder.delete(0, 8);
		System.out.println(builder);
		/*
		 * ,����Ϊ�˸ı�����
		 * ����,����Ϊ�˸ı�����
		 */
		builder.insert(0, "����");
		System.out.println(builder);

		builder.insert(0, true);
		System.out.println(builder);
	}
	
	
	
	
	
	
	
	
	
	
	
}
