package top.qaiu.set;

import java.util.HashSet;
import java.util.Set;

//测试Set集合给相同属性的两个对象去重
public class Test6_Set3 {
	public static void main(String[] args) {
		Student s1 = new Student("小明",20);
		Student s2 = new Student("小明",20);
		HashSet set = new HashSet();
		set.add(s1);
		set.add(s2);
		System.out.println(set);//比较s1和s2是否相等,Object提供了==比较,比较的就是对象的地址值
		System.out.println(s1.equals(s2));
		//需求比较对象的属性值而不是地址值
	}
}

//创建一个学生类
class  Student{
	private String name;
	private int age;

	public Student() {}
	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
	//查看对象的属性值而不是地址值
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	//保证HashCode相同
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}