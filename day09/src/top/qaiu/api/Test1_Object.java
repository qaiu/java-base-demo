package top.qaiu.api;
//����� ��������Object��ķ�����д

import java.lang.annotation.Native;

//toString():Ĭ���������ĵ�ֵַ,����뿴���������ֵ��Ҫ��дtoString
//hashCode:��ȡ�������ڴ��еĹ�ϣ��ֵ(�������ڴ��еı���)
public class Test1_Object {
    public static void main(String[] args) {
        Person p = new Person("��ë",18,"����");
        //top.qaiu.api.Person@1540e19d Ĭ�ϵ�����Object�����toString,ƴ�ӳ���һ���ַ���
        System.out.println(p);
        //��Ҫ���ÿ�����������ֵƴ�ӳ����ַ���
    }
}

class Person{
    private String name;
    private int age;
    private String addr;

    public Person(){}
    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return addr != null ? addr.equals(person.addr) : person.addr == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        return result;
    }
}
