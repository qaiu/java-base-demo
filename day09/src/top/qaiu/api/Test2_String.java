package top.qaiu.api;

import java.util.Arrays;
import java.util.Locale;

public class Test2_String {
    public static void main(String[] args) {
        //1.创建字符串对象
        char[] c = {'H','e','L','l','o'};
        String str = new String(c);//在堆内存开辟空间

        String str2 = "Hello";//在堆内存中的常量池中
        String str3 = "Hello";

        //2.常见方法测试
        System.out.println(str.charAt(2));//L
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("x"));//false
        System.out.println(str.indexOf("o"));//4
        System.out.println(str2.lastIndexOf("l"));//3
        System.out.println(str.length());//5
        System.out.println(str.substring(2));//Llo
        System.out.println(str.substring(1,3));//eL
        //valueOf() --参数类型转换
        System.out.println(String.valueOf(100)+1);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        byte[] bs = str.getBytes();//把字符串转换成byte
        System.out.println(Arrays.toString(bs));

        str = "1|2|3|4|5|6|7";
        String[] strs = str.split("\\|");
        System.out.println(Arrays.toString(strs));


    }

}
