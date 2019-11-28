package pet;

public class Cat extends Pet {
	
	String gender;
	public Cat() {
	}
	
	
	public Cat(String name, int age, double weight, String gender) {
		super(name, age, weight);
		this.gender = gender;
	}
	
}
