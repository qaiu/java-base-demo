package top.qaiu;

public class Test1_Abstract {
    public static void main(String[] args) {
        System.out.println("OK");
        System.out.println("OK");

    }
}

//����������
//3.�����������󷽷�,���������ǳ�����
abstract class Animal{
    //1.���󷽷�û�з�����ķ���
    //2.ʹ��abstract�ؼ������������󷽷�
    abstract public void eat();
    public void sleep(){

    }
    abstract public void sleep(int time);
}

//��������
//5����̳г������:��Ȼ��һ��������+��д���󷽷�
class Cat extends Animal {
    @Override //��д�ı�־ @Overrideע��
    public void eat() {

    }

    @Override
    public void sleep(int time) {
    }

    //��д

}
