package person;

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
	
	public void personInfo() {
		// TODO 自动生成的方法存根
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+gender);
	}

}
