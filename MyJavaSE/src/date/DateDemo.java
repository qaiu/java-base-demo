package date;

import java.util.Date;

/**
 * java.lang.Date
 * ������
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ��
 * �ڲ�ά����һ��longֵ,��ֵ��ʾ
 * 1970.1.1  0:0:0 ����ǰ�ĺ�����
 * 
 * Date����ʱ�������ǧ���������jdk1.1
 * �д󲿷ֶ����������˹�ʱ���� ������ʹ��
 * @author QAIU
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/*
		 * Date�󲿷ַ������ǹ�ʱ��
		 * 
		 * 
		 */
		System.out.println(date.getYear());
		/*
		 * date.getTime()
		 * ��ȡDate�ڲ�ά����longֵ
		 */
		
		long time = date.getTime();
		System.out.println(time);
		
		/*
		 * ����ʱ��
		 */
//		date.setTime(0);
		date.setDate(0);
		System.out.println(date);
		
	}
}
