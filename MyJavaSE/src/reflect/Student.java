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
		System.out.println("student:�ú�ѧϰ,��������");
	}
	
	public void say(String name) {
		System.out.println("student:��Һ�! ����"+name);
	}
	public void say(String name, int age) {
		System.out.println("��Һ�,����:"+name+",����"+age);
	}
	private void hh() {
		System.out.println("����˽�з���!!!!!!!!");
	}

	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", age=" + age + "]";
	}

	
	
}
