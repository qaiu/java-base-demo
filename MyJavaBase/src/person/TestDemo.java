package person;

public class TestDemo {
	public static void main(String[] args) {
		Student student=new Student("张三丰", 110, "男", "五年级");
		student.personInfo();
		Teacher teacher=new Teacher("张三", 30, "男", "计算机");
		teacher.personInfo();
		
	}
}
