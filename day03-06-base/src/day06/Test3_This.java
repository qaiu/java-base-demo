package day06;

import org.junit.Test;

public class Test3_This {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.show();
	}
}

//����teacher��
class Teacher{
	int sum;
	//this��ʾ�������ö���
	public void show() {
		int sum = 10;
		System.out.println(this.sum);
	}
	
}