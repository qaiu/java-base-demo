package top.qaiu;

public class Test1_Abstract {
    public static void main(String[] args) {
        System.out.println("OK");
        System.out.println("OK");

    }
}

//创建抽象类
//3.如果类包含抽象方法,这个类必须是抽象类
abstract class Animal{
    //1.抽象方法没有方法体的方法
    //2.使用abstract关键字来描述抽象方法
    abstract public void eat();
    public void sleep(){

    }
    abstract public void sleep(int time);
}

//创建子类
//5子类继承抽象类后:仍然是一个抽象类+重写抽象方法
class Cat extends Animal {
    @Override //重写的标志 @Override注解
    public void eat() {

    }

    @Override
    public void sleep(int time) {
    }

    //重写

}
