package person;

public class Student extends Person{
	String grade;

	public Student() {
	}
	public Student(String name,int age,String gender,String grade) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.grade = grade;
	}
	
}
