package exception;

public class ExceptionAPIDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String string = "abc";
			System.out.println(Integer.parseInt(string));
		} catch (Exception e) {
			System.out.println("���������");
			//��ȡ������Ϣ
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("���������");
	}
}
