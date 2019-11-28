package oopday04.per;

public class TestDemo {

	public static void main(String[] args) {

		Person p[] = {
			new Teacher("杰瑞",5,"女","学猫叫"),
			new Student("汤姆",12,"男","初一"),
			new Teacher("大白",22,"女","计算机 "),
			new Student("小白",14,"男","初一")
		};
		
		for (Person person : p) {
			person.info();
		}
	}
}
