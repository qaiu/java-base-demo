package exception;
/**
 * finally��
 * finally�����쳣������Ƶ����һ��
 * �����Ա�ֻ֤Ҫ����ִ�е�try���У������Ƿ��׳��쳣��finally���еĴ��붼��ִ��
 * ������Ǿ������ͷ���Դ��������������������IO�е����رղ���
 * @author QAIU
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "";
			System.out.println(str.length());
		} catch(Exception e) {
			System.out.println("����");
		} finally {
			System.out.println("ooooooooook");
			
		}
		
		System.out.println("���������");
	}
}
