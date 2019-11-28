package day05.oop;

public class Test5_OOP3 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "小狗狗";
		a.age = 1;
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.eat();
	}
}
class Animal{
	//特征
	String name;
	int age;
	
	//功能
	public void  eat() {
		System.out.println("吃啥都行");
	}
}
