package day05.oop;

//����������Ͷ���Ĵ�����ʹ��
//һ��Java�ļ������ж��class ��ֻ����һ����public����
//.java���ļ���Ҫ�ͱ�public���ε�һ��

public class Test3_OOP {
	public static void main(String[] args) {
		//���ԣ���������Ķ���
		//ͨ��new��������p���������ͣ�������Person����ĵ�ֵַ
		Person p = new Person();
		p.name = "�ܴ�";
		p.age = 20;
		double  d = 1d;
		p.country = "�й�";
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.country);
		
		//����p�Ĺ��ܺ�����
		p.eat();
		p.study();
		System.out.println(p.country);
	}

}

//�����������ࣺ��������һ������������͹���
class Person{
	//���� --��Ա����/����
	String country;
	int age;
	String name;
	
	
	//���� --��Ա����
	public void eat() {
		System.out.println("���ڳ�����...");
	}
	
	public void study() {
		System.out.println("����ѧϰ���ô���ing...");
	}
	
	
}