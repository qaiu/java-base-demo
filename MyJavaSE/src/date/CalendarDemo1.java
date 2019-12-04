package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.lang.Calendar ������
 * Calendar��һ��������
 * �涨��һЩ����ʱ���һЩ����
 * ���õ�ʵ����GregorianCalendar ������
 * 
 * Calendar�ṩ��һ����̬����getInstance()
 * ���Ը��ݵ�ǰϵͳ���ڵ�ʱ����ȡһ��
 * ʵ���ಢ���ڲ���ʾ��ʱ��Ĭ��Ϊ��ǰϵͳʱ��
 * @author QAIU
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * getTime()
		 * ��ȡʱ�� ����һ��Date
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Calendar.setTime()
		 * ����ʱ��
		 */
		System.out.println();
	}
}
