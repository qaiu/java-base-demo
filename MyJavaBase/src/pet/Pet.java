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
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+weight);
	}
	
	
	
}
