package pet;

public class Dog extends Pet {
	
	String strain;
	
	public Dog() {
	}
	public Dog(String name,int age,double weight,String strain) {
		super(name, age, weight);
		this.strain=strain;
	}
	
	public void dogInfo() {
		
	}
	
}