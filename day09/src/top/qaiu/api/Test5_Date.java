package top.qaiu.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5_Date {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        //���÷���`
        System.out.println(d);
        System.out.println(d.getYear());//��ȡ�� ��1900������
        System.out.println(d.getDate());//�����Ƕ�ú�
        System.out.println(d.getHours());//�����Ƕ���Сʱ
        System.out.println(d.getMinutes());//���ٷ���
        System.out.println(d.getSeconds());//����
        System.out.println(d.getTime());//��1900�굽���ڵ�����
        System.out.println(d.getMonth());//�·�,0��11

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        //y�� M�� d�� Hʱ(24����) hСʱ(12����) m�� s�� a(am or pm)
        System.out.println(sdf.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        String date = "2019-11-12";
        Date d2 = sdf2.parse(date);
        System.out.println(d.toLocaleString());

    }
}
