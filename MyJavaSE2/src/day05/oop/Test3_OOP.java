package day05.oop;

//这个类测试类和对象的创建和使用
//一个Java文件可以有多个class 但只能有一个被public修饰
//.java的文件名要和被public修饰的一致

public class Test3_OOP {
	public static void main(String[] args) {
		//测试：产生人类的对象
		//通过new创建对象，p是引用类型，引用了Person对象的地址值
		Person p = new Person();
		p.name = "熊大";
		p.age = 20;
		double  d = 1d;
		p.country = "中国";
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.country);
		
		//调用p的功能和属性
		p.eat();
		p.study();
		System.out.println(p.country);
	}

}

//用来描述人类：抽象人这一类事物的特征和功能
class Person{
	//特征 --成员变量/属性
	String country;
	int age;
	String name;
	
	
	//功能 --成员方法
	public void eat() {
		System.out.println("正在吃猪肉...");
	}
	
	public void study() {
		System.out.println("正在学习，敲代码ing...");
	}
	
	
}