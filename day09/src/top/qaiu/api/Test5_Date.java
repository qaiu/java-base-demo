package top.qaiu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5_Date {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        //常用方法`
        System.out.println(d);
        System.out.println(d.getYear());//获取年 从1900年至今
        System.out.println(d.getDate());//今天是多好号
        System.out.println(d.getHours());//现在是多少小时
        System.out.println(d.getMinutes());//多少分钟
        System.out.println(d.getSeconds());//秒数
        System.out.println(d.getTime());//从1900年到现在的秒数
        System.out.println(d.getMonth());//月份,0到11

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        //y年 M月 d日 H时(24进制) h小时(12进制) m分 s秒 a(am or pm)
        System.out.println(sdf.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        String date = "2019-11-12";
        Date d2 = sdf2.parse(date);
        System.out.println(d.toLocaleString());

    }
}
