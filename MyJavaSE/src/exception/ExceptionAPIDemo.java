package exception;

public class ExceptionAPIDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String string = "abc";
			System.out.println(Integer.parseInt(string));
		} catch (Exception e) {
			System.out.println("程序出错了");
			//获取错误信息
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了");
	}
}
