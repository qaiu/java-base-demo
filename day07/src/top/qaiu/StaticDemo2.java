package top.qaiu;

public class StaticDemo2 {

    public static void main(String[] args) {
//        Persion p = new Persion();
//        System.out.println(p.home);
//        System.out.println(Persion.home);
    }
}

class Persion{
    static String home;
    int age;
    {

    }
    //���췽��:���ڴ�������
    //��������:��������ʹ��
    //�ֲ������:��������ʱ����,���ڿ��Ʊ��������÷�Χ

    static {
        System.out.println("��̬��ִ��");
        home = "Earth";
    }    //��̬�����:�������ʹ��


}
