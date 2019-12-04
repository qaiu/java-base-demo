package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * void set(int field,int value)
 * 调整时间分量
 * @author QAIU
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		
		Calendar calendar =Calendar.getInstance();
		System.out.println(
				new SimpleDateFormat("yyyy-MM-dd E hh:mm:dd")
				.format(calendar.getTime()));
		//调整时间
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//改年
		calendar.set(Calendar.YEAR,2008);
		System.out.println(calendar.getTime());
	}
}
