package string;
/**
 * StringBuilder修改字符串的性能
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
		System.out.println("执行完毕"+(endTime-startTime));
		System.out.println(builder.length());
	}
}
