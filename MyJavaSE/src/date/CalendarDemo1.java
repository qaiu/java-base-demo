package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.lang.Calendar 日历类
 * Calendar是一个抽象类
 * 规定了一些操作时间的一些方法
 * 常用的实现类GregorianCalendar 即阳历
 * 
 * Calendar提供了一个静态方法getInstance()
 * 可以根据当前系统所在的时区获取一个
 * 实现类并其内部表示的时间默认为当前系统时间
 * @author QAIU
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * getTime()
		 * 获取时间 返回一个Date
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * Calendar.setTime()
		 * 调整时间
		 */
		System.out.println();
	}
}
