package top.qaiu.interfacedemo;

public class Test5_Inter2 {
    public static void main(String[] args) {

    }
}

interface Inter2{
    //接口里都是抽象方法
    void eat();
    void study();

    default void eat(int id){

    }

}

class StudentImpl implements Inter2{
    @Override
    public void eat() {
        System.out.println("eat");
    }


    @Override
    public void study() {
        System.out.println("study");
    }
}
