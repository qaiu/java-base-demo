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
		// TODO �Զ����ɵķ������
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("�Ա�:"+gender);
	}

}
