package day03;

public class Test_switch {
	public static void main(String[] args) {
		int i = 1;
		//ֱ��ƥ��������
		//key�����Ϳ�����byte short char int jdk1.5֮�����ƥ��String
		switch (i) {
		case 1: System.out.println("1");break;
		case 2: System.out.println("2");break;
		case 3: System.out.println("3");break;
		case 4: System.out.println("4");break;
		
		//1,���������û������break,�ᴩ͸����case��ִ��default
		//2,break���Խ�������
		//3,������û��ƥ�䵽caseʱ,ֻ��ִ��default
		default: System.out.println("0");
			break;
		}
	}
}
