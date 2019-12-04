package date;

import java.util.Date;

/**
 * java.lang.Date
 * 日期类
 * Date的每一个实例用于表示一个时间
 * 内部维护了一个long值,其值表示
 * 1970.1.1  0:0:0 到当前的毫秒数
 * 
 * Date存在时区问题和千年虫问题在jdk1.1
 * 中大部分都被声明成了过时方法 不建议使用
 * @author QAIU
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/*
		 * Date大部分方法都是过时的
		 * 
		 * 
		 */
		System.out.println(date.getYear());
		/*
		 * date.getTime()
		 * 获取Date内部维护的long值
		 */
		
		long time = date.getTime();
		System.out.println(time);
		
		/*
		 * 设置时间
		 */
//		date.setTime(0);
		date.setDate(0);
		System.out.println(date);
		
	}
}
