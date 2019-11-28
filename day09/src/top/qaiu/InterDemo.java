package top.qaiu;

public class InterDemo {
    public static void main(String[] args) {
        Teacher t1 = new MachTeacher();
        Teacher t2 = new ComputeTeacher();
        t1.teach();
        t2.teach();
        t2.test();
        t1.test();
    }

}

interface Teacher{

    default void test(){
        this.teach();
    }
    void teach();
}

class Teach{

    public void test(){
        System.out.println("test3");
    }
}
//不提

class MachTeacher extends Teach implements Teacher{
    @Override
    public void teach() {
        System.out.println("教数学");
    }
}

class ComputeTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("教计算机");
    }

    @Override
    public void test() {
        System.out.println("zi test");
    }
}
