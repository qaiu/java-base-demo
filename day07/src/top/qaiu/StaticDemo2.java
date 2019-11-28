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
    //构造方法:用于创建对象
    //构造代码块:创建对象使用
    //局部代码块:函数调用时才用,用于控制变量的作用范围

    static {
        System.out.println("静态块执行");
        home = "Earth";
    }    //静态代码块:类加载是使用


}
