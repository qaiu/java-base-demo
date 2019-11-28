package oopday04.per;

public class Teacher extends Person{
	
	String major;

	public Teacher() {
	}

	public Teacher(String name, int age, String gender, String major) {
		super(name, age, gender);
		this.major = major;
	}
	/**
	 * (·Ç Javadoc)
	 * @see oopday04.per.Person#info()
	 */
	@Override
	public void info() {
		super.info();
		System.out.println("×¨Òµ:"+major);
	}

}
