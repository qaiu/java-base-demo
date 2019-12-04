package top.qaiu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teat6_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        String birthday = new Scanner(System.in).nextLine();
        Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
        long start = birth.getTime();//获取出生的毫秒值
        long end = System.currentTimeMillis();//获取当前毫秒值
        System.out.println((end-start)/1000/60/60/24);

    }

}
