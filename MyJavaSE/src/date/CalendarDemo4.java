package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * void add(int field, int amount)
 * 
 * 时间分量加或减给定的值
 * @author QAIU
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//计算下10年10个月后的日期
		calendar.add(Calendar.YEAR, 10);
//		calendar.add(Calendar.MONTH, 10);
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E hh:mm:dd").format(calendar.getTime()));
		
	}
}
