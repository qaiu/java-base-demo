package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 
 * 可以将Date与String按照指定日期格式进行相互转换
 * 
 * @author QAIU
 *
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/**
		 * SimpleDateFormat.format(Date date)
		 * 按照指定格式转换
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日a hh点mm分ss喵");
		String line = sdf.format(date);
		System.out.println(line);
	}
}
