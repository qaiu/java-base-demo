package string;

/**
 * String�ǲ�����󣬼����ַ�������һ��������
 * ���ݲ��ɸı䣬�ı�Ҫ������Ϣ����
 * ����һ��ԭ���볣�����йأ�
 * �ַ��������أ�JVM�ڶ�����һ���ڴ滺������
 * ʹ����������ʽ�������ַ�������һ������ʹ��
 * ���е��������ٴδ����ַ�������ʱ��ֱ������
 * �������Լ����ڴ濪��.
 * @author QAIU
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		//s2������s1����
		System.out.println(s1==s2);
		//s3Ҳ������
		String s3 = "123abc";
		System.out.println(s1==s3);
		s1=s1+"!";
		System.out.println("s1:"+s1);
		System.out.println(s1==s2);
		
		//ʹ��new����ʽ����һ��������¶���
		String s4=new String("123abc");
		//�����Ȼs2��s4������һ�������ǵ�ַ��ͬ
		System.out.println("s4:"+s4);
		/*
		 * �ַ����ڱȽ�ʱӦ����equals�����Ƚ�
		 * ������ʹ��"=="
		 */
		System.out.println(s2.equals(s4));
		/*
		 * ��������һ�����ԣ��ڱ����ڼ���ȷ��һ�����ʽ���ʱ
		 * ��������ֱ�ӽ��м��㣬���� ������뵽class�ļ���
		 * �������д���ᱻ�����������
		 * String s5 = "123abc";
		 */
		String s5="123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s5==s2); //true
		
		String s="123";
		String s6=s+"abc";
		System.out.println("s6:"+s6);
		System.out.println(s6==s2); //false
		
		
		
		
		
		
		
		
		
		
		
	}

}
