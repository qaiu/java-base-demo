package exception;
/**
 * finally块
 * finally块是异常处理机制的最后一块
 * 它可以保证只要代码执行到try当中，无论是否抛出异常，finally块中的代码都会执行
 * 因此我们经常将释放资源的这类操作放在这里，比如IO中的流关闭操作
 * @author QAIU
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "";
			System.out.println(str.length());
		} catch(Exception e) {
			System.out.println("出错");
		} finally {
			System.out.println("ooooooooook");
			
		}
		
		System.out.println("程序结束了");
	}
}
