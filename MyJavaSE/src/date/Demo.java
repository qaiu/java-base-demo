package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 根据自己生日计算活了多少岁
 * 计算出生后第一万天是哪一天
 * 格式 yy-MM-dd
 * 
 */
public class Demo {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入你的生日: 格式yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		String birthday = scan.nextLine();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(birthday);
		long l = (new Date().getTime()-date.getTime())/1000/24/60/60;
		System.out.println("你已经活了"+l+"天");
		date.setTime(date.getTime()+(long)10000*1000*24*60*60);
		String day = new SimpleDateFormat(format).format(date);
		System.out.println("你活到第10000天在"+day);
		
		
	}
}
