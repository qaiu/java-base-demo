package string;
/**
 * StringBuilder�޸��ַ���������
 * @author QAIU
 *
 */
public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("a");

		long startTime =  System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {
			builder.append("a");
		}
		long endTime =  System.currentTimeMillis();
		System.out.println("ִ�����"+(endTime-startTime));
		System.out.println(builder.length());
	}
}
