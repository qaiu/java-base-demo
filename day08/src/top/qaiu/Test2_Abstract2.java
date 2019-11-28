package top.qaiu;

public class Test2_Abstract2 {
    public static void main(String[] args) {
//        Human h = new Student();
//        h.sayHi("小明同学");
//        new Human(){
//            @Override
//            void sayHi(String name) {
//                System.out.println("ok"+name);
//            }
//        }.sayHi("小白");
        TestInterface.hi("大白");

        TestInterface t1 = new TestDemo();
        t1.hi();

        TestInterface t2 = new TestInterface() {
            @Override
            public void hi() {
                System.out.println("Hello");
            }
        };
        t2.hi();

        TestInterface t3 = ()-> System.out.println("Hi");
        t3.hi();
    }
}

@FunctionalInterface
interface TestInterface{
    static void hi(String name){
        System.out.println("hi"+name);
    }

    void hi();
}
class TestDemo implements TestInterface{
    @Override
    public void hi() {
        System.out.println("你好");
    }
}
abstract class Human{
    public void Human(){
        System.out.println("Human");
    }
    public void eat(){
        System.out.println("吃啥都行");
    }
    abstract void sayHi(String name);
}

class Student extends Human{
    @Override
    void sayHi(String name) {
        System.out.println("Hi:"+name);
    }
}

