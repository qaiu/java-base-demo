package date;

import java.util.Calendar;

/**
 * Calendar�ṩ�˷���
 * int get(int field)
 * ��ȡָ��ʱ�������Ӧ��ֵ
 * ʱ�����: ��ʾʱ��ĵ�λ,�� �� ��...
 * ʱ�������Calendar�Գ�������ʽ�ṩ
 * @author QAIU
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1;
		/*
		 * ��ȡ��
		 * ������صķ���:
		 * DAY_OF_MONTH:��DATEһ��
		 * DAY_OF_WEEK: ���е��� �ܼ�
		 * DAY_OF_YEAR: ���е���
		 */
		int day = calendar.get(calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);

		int h = calendar.get(calendar.HOUR_OF_DAY);
		int m = calendar.get(calendar.MINUTE);
		int s = calendar.get(calendar.SECOND);
		
		System.out.println(h+":"+m+":"+s);
		

		int week = calendar.get(calendar.DAY_OF_WEEK);
		int dayy = calendar.get(calendar.DAY_OF_YEAR);
		
		
		System.out.println("��"+week+"һ���еĵ�"+dayy+"��");
		/*
		 * ��ȡָ��ʱ����������ֵ
		 */
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("����һ����"+days+"��");
	}
}
