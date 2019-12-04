package oopday03;

public class Cat {
	String name;
	int age;
	double weight;
	String gender;
	
	public Cat() {
		// TODO 自动生成的构造函数存根
	}
	
	
	public Cat(String name, int age, double weight, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", gender=" + gender + "]";
	}


	public void catInfo() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weight);
		System.out.println("性别:"+gender);
		System.out.println("--------------");
	}

}
