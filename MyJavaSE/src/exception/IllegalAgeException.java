package exception;
/**
 * 年龄不合法异常
 * 
 * 自定义异常,通常用来定义我们项目中某个业务逻辑级别
 * 的错误
 * 
 * 定义一个异常通常需要一下几个步骤:
 * 1:定义类并指定符合该异常的名称
 * 2:需要继承Exception(可以间接继承)
 * 3:提供序列化版本号
 * 4:提供所有构造方法
 * 
 * @author QAIU
 *
 */
public class IllegalAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public IllegalAgeException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 */
	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 */
	public IllegalAgeException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param cause
	 */
	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO 自动生成的构造函数存根
	}
	

}
