package top.qaiu.design;

public class Test7_Sign {

    public static void main(String[] args) {
        Person p = Person.getInstance();
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());

    }
}

class Person {

    //˽�л����췽��
    private void Person(){};
    //�ṩ˽�е�ʵ��������
    private static Person p = new Person();

    static Person getInstance(){
        return p;
    }
}