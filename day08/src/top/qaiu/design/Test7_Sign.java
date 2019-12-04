package top.qaiu.design;

public class Test7_Sign {

    public static void main(String[] args) {
        Person p = Person.getInstance();
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());

    }
}

class Person {

    //私有化构造方法
    private void Person(){};
    //提供私有的实例化过程
    private static Person p = new Person();

    static Person getInstance(){
        return p;
    }
}