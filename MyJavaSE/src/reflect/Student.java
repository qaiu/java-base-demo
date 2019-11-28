package reflect;

public class Student {
	String nameString;
	int age;
	
	
	/**
	 * @param nameString
	 * @param age
	 */
	public Student(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}

	public void study() {
		System.out.println("student:好好学习,天天向上");
	}
	
	public void say(String name) {
		System.out.println("student:大家好! 我是"+name);
	}
	public void say(String name, int age) {
		System.out.println("大家好,我是:"+name+",今年"+age);
	}
	private void hh() {
		System.out.println("我是私有方法!!!!!!!!");
	}

	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", age=" + age + "]";
	}

	
	
}
