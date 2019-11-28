package Seria;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Teat5_Seria2 {
	@Test
	public void test1() throws Exception{
		Animal a = new Animal("小黄", 3, "雄性");
		ObjectMapper mapper = new ObjectMapper();
		String s = mapper.writeValueAsString(a);
		mapper.writeValue(new FileOutputStream("animal2.json"), a);
		
		FileOutputStream fos = new FileOutputStream("animal2.json");
		System.out.println(s);
		Animal a2 = mapper.readValue(s, Animal.class);
		System.out.println(a2);
		
		System.out.println(new ObjectMapper().writeValueAsString(new Animal("大黄", 4, "雌性")));
		System.out.println(new ObjectMapper().readValue("{\"name\":\"大黄\",\"age\":4,\"gender\":\"雌性\"}", Animal.class));
		
		
	}
}

class Animal implements Serializable{
	private static final long serialVersionUID = -3234950472731237761L;
	private String name;
	private int age;
	private String gender;
	/**
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Animal() {}
	public Animal(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
