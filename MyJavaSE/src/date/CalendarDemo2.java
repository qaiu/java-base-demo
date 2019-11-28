package date;

import java.util.Calendar;

/**
 * Calendar提供了方法
 * int get(int field)
 * 获取指定时间分量对应的值
 * 时间分量: 表示时间的单位,年 月 日...
 * 时间分量有Calendar以常亮的形式提供
 * @author QAIU
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1;
		/*
		 * 获取日
		 * 和天相关的分量:
		 * DAY_OF_MONTH:与DATE一致
		 * DAY_OF_WEEK: 周中的天 周几
		 * DAY_OF_YEAR: 年中的天
		 */
		int day = calendar.get(calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);

		int h = calendar.get(calendar.HOUR_OF_DAY);
		int m = calendar.get(calendar.MINUTE);
		int s = calendar.get(calendar.SECOND);
		
		System.out.println(h+":"+m+":"+s);
		

		int week = calendar.get(calendar.DAY_OF_WEEK);
		int dayy = calendar.get(calendar.DAY_OF_YEAR);
		
		
		System.out.println("周"+week+"一年中的第"+dayy+"天");
		/*
		 * 获取指定时间分量的最大值
		 */
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("当月一共有"+days+"天");
	}
}
