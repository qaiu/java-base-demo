package top.qaiu.api;
//这个类 用来测试Object类的方法重写

import java.lang.annotation.Native;

//toString():默认输出对象的地址值,如果想看对象的属性值就要重写toString
//hashCode:获取对象在内存中的哈希码值(对象在内存中的编码)
public class Test1_Object {
    public static void main(String[] args) {
        Person p = new Person("阿毛",18,"济南");
        //top.qaiu.api.Person@1540e19d 默认调用了Object类里的toString,拼接成了一个字符串
        System.out.println(p);
        //想要输出每个对象的属性值拼接成了字符串
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
