package top.qaiu;

//������������Զ�̬��ʹ��
public class Test_Duotai2 {
    public static void main(String[] args) {
        Sharp s = new Sharp();
        s.draw();
        System.out.println(s.line);

        Sharp s2 = new Circle();
        s2.draw();
        System.out.println(s2.line);
        System.out.println(s2.name);
    }
}

//��������
class Sharp{
    int line;
    static String name = "Sharp";
    public void draw(){
        System.out.println("������״");
    }
}
//��������
class Circle extends Sharp{
    @Override
    public void draw() {
        System.out.println("����ȦȦ");
    }
}