package day03;

public class Test_switch {
	public static void main(String[] args) {
		int i = 1;
		//直接匹配合适情况
		//key的类型可以是byte short char int jdk1.5之后可以匹配String
		switch (i) {
		case 1: System.out.println("1");break;
		case 2: System.out.println("2");break;
		case 3: System.out.println("3");break;
		case 4: System.out.println("4");break;
		
		//1,如果程序中没有遇到break,会穿透所有case并执行default
		//2,break可以结束条件
		//3,当程序没有匹配到case时,只会执行default
		default: System.out.println("0");
			break;
		}
	}
}
