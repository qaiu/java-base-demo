package day06;

public class Test_Cat {
	
	public static void main(String[] args) {
		System.out.println("ok");
	}
}

class C{
	{
		System.out.println("代码块");
	}
	public C() {
		System.out.println("无参构造");
	}

	public C(String s) {
		System.out.println("含参构造");
	}
	
}

