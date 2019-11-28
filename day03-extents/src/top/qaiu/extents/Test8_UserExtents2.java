package top.qaiu.extents;

public class Test8_UserExtents2 {
	public static void main(String[] args) {
		new Son().eat();
	}
}

abstract class  Father{
	public void eat() {
		
	}
	private void name() {
		
	}
}

class Son extends Father{
	public void shopping() {
		System.out.println("儿子爱花钱");
	}
	
	//子类修改父类的原有功能--重写
	//重写要求:修饰符>=父类,方法声明一模一样
	@Override
	public void eat() {
		
		System.out.println("儿子喝汤");
	}
	
}