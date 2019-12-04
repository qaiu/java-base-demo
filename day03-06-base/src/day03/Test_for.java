package day03;

//这个类用来测试循环结构
public class Test_for {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			System.out.println(i+"同学好");
		}
		
		System.out.println();
		//打印0到10
		// int i = 0; 此时i记录的是每次获取到的值,默认值从0开始
		// i<11 判断i获取带的值必须在范围内,否则就退出循环
		// i++ 由于获取到的值时012345678910是一个自增的过程
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// i = 8;
		// i = i*10+8
		for (int i = 8; i <= 8888;i = i*10 + 8) {
			System.out.print(i+",");
		}
	}

}
