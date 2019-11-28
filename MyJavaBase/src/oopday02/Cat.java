package oopday02;

public class Cat {

	String name;
	int age;
	double weigth;
	String gender;
	static int kk=30;
	public Cat(String name,int age,double weigth,String gender) {
		this.name=name;
		this.age=age;
		this.weigth=weigth;
		this.gender=gender;
	}
	public void catInfo() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weigth);
		System.out.println("性别:"+gender);
	}
	public Cat() {
		// TODO 自动生成的构造函数存根
	}
	static void sayHi() {
		System.out.println("hi");
	}
}
