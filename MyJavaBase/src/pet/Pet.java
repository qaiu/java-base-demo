package pet;

public class Pet {
	String name;
	int age;
	double weight;
	
	public Pet() {
	}
	public Pet(String name,int age,double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void petInfo() {
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("体重:"+weight);
	}
	
	
	
}
