package top.qaiu.interfacedemo;

public class InterImpl implements Test3_Inter,Test3_Inter2{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void method() {
        int a;
    }
}
