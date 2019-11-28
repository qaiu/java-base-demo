package top.qaiu.set;

import java.util.HashSet;
import java.util.Set;

//����Set���ϸ���ͬ���Ե���������ȥ��
public class Test6_Set3 {
	public static void main(String[] args) {
		Student s1 = new Student("С��",20);
		Student s2 = new Student("С��",20);
		HashSet set = new HashSet();
		set.add(s1);
		set.add(s2);
		System.out.println(set);//�Ƚ�s1��s2�Ƿ����,Object�ṩ��==�Ƚ�,�Ƚϵľ��Ƕ���ĵ�ֵַ
		System.out.println(s1.equals(s2));
		//����Ƚ϶��������ֵ�����ǵ�ֵַ
	}
}

//����һ��ѧ����
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
	//�鿴���������ֵ�����ǵ�ֵַ
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	//��֤HashCode��ͬ
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