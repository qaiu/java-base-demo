package oopday04.per;

public class TestDemo {

	public static void main(String[] args) {

		Person p[] = {
			new Teacher("����",5,"Ů","ѧè��"),
			new Student("��ķ",12,"��","��һ"),
			new Teacher("���",22,"Ů","����� "),
			new Student("С��",14,"��","��һ")
		};
		
		for (Person person : p) {
			person.info();
		}
	}
}
