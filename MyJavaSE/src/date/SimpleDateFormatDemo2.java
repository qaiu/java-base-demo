package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����Date��ʽ���ַ���
 * @author QAIU
 *
 */
public class SimpleDateFormatDemo2 {
	
	public static void main(String[] args) throws ParseException {
		String line = "2019��10��24������ 10��41��12�� ������";
		String format = "yyyy��MM��dd��a hh��mm��ss�� E";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(line);
		System.out.println(new SimpleDateFormat(format).format(date));
		
		
	}
}
