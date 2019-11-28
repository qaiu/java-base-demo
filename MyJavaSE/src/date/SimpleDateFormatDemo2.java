package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 解析Date格式的字符串
 * @author QAIU
 *
 */
public class SimpleDateFormatDemo2 {
	
	public static void main(String[] args) throws ParseException {
		String line = "2019年10月24日上午 10点41分12秒 星期四";
		String format = "yyyy年MM月dd日a hh点mm分ss秒 E";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(line);
		System.out.println(new SimpleDateFormat(format).format(date));
		
		
	}
}
