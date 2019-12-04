package apidoc;

/**
 * 文档注释是功能级注释，只在三个地方使用：
 * 类，方法，常量
 * 在类上使用是用来说明当前类的功能，设计意图等
 * @author QAIU
 * @version 1.0.0
 * @since JDK8
 * @see java.lang.String
 *
 */
public class DocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public final static String INFO = "你好";
	/**
	 * 为给定的用户添加问候语
	 * @param name 给定的名字
	 * @return 带有问候语句的字符串
	 */
	public String sayHello(String name) {
		return "你好"+name;
	}
	public static void main(String[] args) {
		System.out.println(new DocDemo().sayHello("qaiu"));
	}
}
