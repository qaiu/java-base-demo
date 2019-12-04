package oopday04.per;

public class Student extends Person{
	String grade;
	public Student() {
	}
	public Student(String name, int age, String gender, String grade) {
		super(name, age, gender);
		this.grade = grade;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("°à¼¶:"+grade);
	}
}
