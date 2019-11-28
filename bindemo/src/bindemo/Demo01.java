package bindemo;

public class Demo01 {
	public static void main(String[] args) {
		int i = 50;
		/*
		 * toBinaryString 将整数i在内存中存储的
		 * 2进制实际位数转换为字符串
		 * 
		 * 如需要展示一个整数在内存中实际2进制
		 * 情况时候就调用这个方法
		 */
		// 编译时候 将十进制50转为2进制
		// 软件运行期间 i在内存中是2进制
		System.out.println(Integer.toBinaryString(i));
		/*
		 * i在内存中就是2进制的 110010
		 * 而println在输出的时候 自动调用了 
		 * Integer.toString()
		 * 将2进制转为10进制字符串
		 */
		for (int j = 0; j < 150; j++) {
			System.out.println(Integer.toBinaryString(j));
		}
	}
}
