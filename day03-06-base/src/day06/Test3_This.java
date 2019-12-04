package day06;

import org.junit.Test;

public class Test3_This {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.show();
	}
}

//创建teacher类
class Teacher{
	int sum;
	//this表示本类引用对象
	public void show() {
		int sum = 10;
		System.out.println(this.sum);
	}
	
}