package oopday02;

public class Cat {

	String name;
	int age;
	double weigth;
	String gender;
	static int kk=30;
	public Cat(String name,int age,double weigth,String gender) {
		this.name=name;
		this.age=age;
		this.weigth=weigth;
		this.gender=gender;
	}
	public void catInfo() {
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("����:"+weigth);
		System.out.println("�Ա�:"+gender);
	}
	public Cat() {
		// TODO �Զ����ɵĹ��캯�����
	}
	static void sayHi() {
		System.out.println("hi");
	}
}
