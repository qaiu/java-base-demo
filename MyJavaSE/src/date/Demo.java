package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * �����Լ����ռ�����˶�����
 * ����������һ��������һ��
 * ��ʽ yy-MM-dd
 * 
 */
public class Demo {
	public static void main(String[] args) throws ParseException {
		System.out.println("�������������: ��ʽyyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		String birthday = scan.nextLine();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(birthday);
		long l = (new Date().getTime()-date.getTime())/1000/24/60/60;
		System.out.println("���Ѿ�����"+l+"��");
		date.setTime(date.getTime()+(long)10000*1000*24*60*60);
		String day = new SimpleDateFormat(format).format(date);
		System.out.println("����10000����"+day);
		
		
	}
}
