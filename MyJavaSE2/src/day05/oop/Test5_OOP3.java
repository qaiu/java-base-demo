package day05.oop;

public class Test5_OOP3 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "С����";
		a.age = 1;
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.eat();
	}
}
class Animal{
	//����
	String name;
	int age;
	
	//����
	public void  eat() {
		System.out.println("��ɶ����");
	}
}
