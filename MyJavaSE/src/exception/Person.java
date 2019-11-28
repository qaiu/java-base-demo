package exception;
/**
 * 使用当前类测试异常的抛出
 * @author QAIU
 *
 */
public class Person {
	private int age;

	public int getAge() {
		
		return age;
	}
	/**
	 * 当一个方法中使用throw抛出某个异常时,就要在
	 * 当前方法上使用throws声明该异常的抛出 以通知
	 * 调用者处理该异常
	 * 只有抛出RuntimeException时 编译器不要求必须写,
	 * 否则必须写throws
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		if (age<0 || age>100) {
			//主动抛出异常告知业务不合理
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}
