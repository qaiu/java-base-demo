package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 
 * ���Խ�Date��String����ָ�����ڸ�ʽ�����໥ת��
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
		 * ����ָ����ʽת��
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��a hh��mm��ss��");
		String line = sdf.format(date);
		System.out.println(line);
	}
}
