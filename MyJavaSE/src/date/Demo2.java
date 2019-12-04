package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ���뱣�������� �������� yyyy-MM-dd ��Ʒ���ڵ�ǰ���ܵ�����Ϊ������
 * 
 * @author QAIU
 *
 */
public class Demo2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		String format = "yyyy-MM-dd";
		System.out.println("������������: ��ʽyyyy-MM-dd");
		String productionDay = scan.nextLine();
		System.out.println("���䱣��������:");
		int day = scan.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		Date date = sdf.parse(productionDay);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.DAY_OF_YEAR, day);
		calendar.add(Calendar.WEEK_OF_YEAR, -2);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		System.out.println(sdf.format(calendar.getTime()));
	}
}
