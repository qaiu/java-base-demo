package top.qaiu.interfacedemo;

public class Teat6_UserIntre {

    public static void fun(Fu f){
        f.eat();
    }
    public static void main(String[] args) {
        Fu f = new FuImpl();
        System.out.println(Fu.sum);
        System.out.println(f.sum);

        fun(()-> System.out.println("��Щʲô��?"));
    }
}

interface Fu<T>{
    //1.�ӿ�������й��췽��
    //2.�ӿ���û�б���,���Ǿ�̬����:���Զ�ƴ��public static final
    int sum = 10;
    //3.�ӿ��ﶼ�ǳ��󷽷�:���Զ�ƴ��public abstract
    void eat();
}

class FuImpl implements  Fu{
    @Override
    public void eat() {

    }
}