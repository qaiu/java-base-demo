package string;
/**
 * boolean startWith(String str)
 * boolean endWith(String str)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ���߽�β��
 * @author QAIU
 *
 */
public class StartWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("think");
		System.out.println("starts:"+starts);
		
		boolean ends = str.endsWith("ava");
		System.out.println("ends:"+ends);
	}
}
