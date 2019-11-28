package oopday04.per;

public class Person {

	String name;
	int age;
	String gender;
	public Person() {
		
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void info() {
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+gender);
	}
}
