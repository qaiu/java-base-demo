package exception;

/**
 * Finally常见面试题 
 * 
 * 1:请分别说明final,finally,finalize 
 * final是一个修饰符 
 * 被final修饰的类不可以被继承
 * 被final修饰的变量是一个常量只能赋值一次， 
 * 被final修饰的方法不可以被重写
 * 
 * finally语句块
 * finally在异常处理时提供finally块来执行所有清除操作。
 * 主要与try-catch-finally配合使用。
 * finally语句块的作用是无论出现什么情况，
 * finally块中的语句一定会被执行，并且是在return之前执行。
 * 根据JAVA规范，如果try-finally或者catch-finally中都有return，
 * 则2个return都执行并最终返回调用者那里的是finally中的return，
 * 如果finally中没有return则返回的是catch中的return， 
 * 但是finally中的代码也是要执行的。
 * 
 * finalize是方法名。
 * 使用finalize方法在垃圾收集器将对象从
 * 内存中清除出去之前做必要的清理工作。
 * 这个方法是由垃圾收集器在确定这个对象
 * 没有被引用时对这个对象调用的。它是在
 * object类中定义的，因此所有的类都继承了它。
 * 子类覆盖finalize方法以整理系统资源或者被执行其他清理工作。
 * 
 * @author QAIU
 */
public class FinallyDemo33 {
	public static void main(String[] args) {
		System.out.println(test("0") + "," + test(null) + "," + test(""));
	}

	public static int test(String str) {
		try {
			return str.charAt(0) - '0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
