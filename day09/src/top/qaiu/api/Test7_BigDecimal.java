package top.qaiu.api;

import java.math.BigDecimal;
import java.util.Scanner;

//�������������BigDecimal���÷�
public class Test7_BigDecimal {
    public static void main(String[] args) {
        //�����û����������������a b
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        BigDecimal bd = new BigDecimal(a);
        BigDecimal bd2 = new BigDecimal(b);
        System.out.println(bd.add(bd2).doubleValue());
        System.out.println(bd.subtract(bd2).doubleValue());
        System.out.println(bd.multiply(bd2).doubleValue());
        System.out.println(bd.divide(bd2,3,BigDecimal.ROUND_HALF_UP).doubleValue());

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);

    }

}
