package oopday03;

public class Cat {
	String name;
	int age;
	double weight;
	String gender;
	
	public Cat() {
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+weight);
		System.out.println("�Ա�:"+gender);
		System.out.println("--------------");
	}

}
