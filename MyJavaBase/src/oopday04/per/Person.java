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
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("�Ա�:"+gender);
	}
}
