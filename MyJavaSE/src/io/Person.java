package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类实例测试 对象流的读写操作
 * @author QAIU
 */
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient String[] otherInfo;
	
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
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
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	@Override
	public String toString() {
		return name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}
	
}
