package top.qaiu.interfacedemo;

public class Teat6_UserIntre {

    public static void fun(Fu f){
        f.eat();
    }
    public static void main(String[] args) {
        Fu f = new FuImpl();
        System.out.println(Fu.sum);
        System.out.println(f.sum);

        fun(()-> System.out.println("吃些什么呢?"));
    }
}

interface Fu<T>{
    //1.接口里必能有构造方法
    //2.接口里没有变量,都是静态常量:会自动拼接public static final
    int sum = 10;
    //3.接口里都是抽象方法:会自动拼接public abstract
    void eat();
}

class FuImpl implements  Fu{
    @Override
    public void eat() {

    }
}