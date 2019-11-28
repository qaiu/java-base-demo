package exception;
/**
 * 异常的抛出
 * 使用throw关键字可以主动抛出一个异常实例
 * 通常以下两种情况会主动抛出异常
 * 1:满足语法要求,但不满足业务逻辑时
 * 2:当前代码片段确实出现了异常,但是该异常处理不应当
 * 在当前代码片段被解决时
 * @author QAIU
 *
 */

public class ThrowDemo {
	public static void main(String[] args) {
		Person p = new Person();
		//满足语法要求,但是不符合业务逻辑
		try {
			/*
			 * 当我们调用一个含有throws声明的方法时,编译器会要求我们必须处理
			 * 该异常,通常处理手段有两种
			 * 1.使用try-catch捕捉并处理
			 * 2.在当前方法继续使用throws声明将该异常抛出
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}

}
