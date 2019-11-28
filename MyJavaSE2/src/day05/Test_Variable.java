package day05;

import java.util.Arrays;

import org.junit.Test;

//这个类用来测试变量的使用
public class Test_Variable {
	//单元测试方法
	//要求：@Test注解 + public + void + 无参
	//测试效果:选中方法名 --右键 --Run as --Junit test
	
	//成员变量在类里 在方法外
	
	int sum = 0;
	int count = 10;
	@Test
	public void show() {
		//局部变量：在方法里 + 必须手动初始化 + 作用范围在方法里
		
		int count = 10;
		System.out.println(count);
		System.out.println(sum);
	}
}
