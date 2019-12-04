package top.qaiu.interfacedemo;

public interface Test3_Inter {
    void eat();
    void sleep();
    default void method(){
        System.out.println("接口的默认方法");
    }
}
