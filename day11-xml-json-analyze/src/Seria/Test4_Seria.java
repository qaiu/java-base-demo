package Seria;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Test4_Seria {
	//序列化:利用Jackson的技术,从Java对象变成json串 --ObjectMapper
	@Test
	public void seria() throws Exception {
		Person p = new Person("rose",12,"Taitanic");
		ObjectMapper mapper = new ObjectMapper();
		
		//把指定的对象p变成json串
		String json = mapper.writeValueAsString(p);
		System.out.println(json);
		mapper.writeValue(new File("./1.txt"), p);
	}
	@Test //反序列化:把json串转为Java对象
	public void deseria() throws Exception {
		String json = "{\"name\":\"rose\",\"age\":12,\"address\":\"Taitanic\"}";
		ObjectMapper mapper = new ObjectMapper();
		//mapperValue(m,n) --m是指想要的转换的json字符串,n是指转成那个对象(字节码文件)
		Person p = mapper.readValue(json, Person.class);
		System.out.println(p);
		
	}
}


class Person{
	
	private String name;
	private int age;
	private String address;
	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}