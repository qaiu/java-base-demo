package apidoc;

/**
 * �ĵ�ע���ǹ��ܼ�ע�ͣ�ֻ�������ط�ʹ�ã�
 * �࣬����������
 * ������ʹ��������˵����ǰ��Ĺ��ܣ������ͼ��
 * @author QAIU
 * @version 1.0.0
 * @since JDK8
 * @see java.lang.String
 *
 */
public class DocDemo {
	/**
	 * sayHello�����е��ʺ���
	 */
	public final static String INFO = "���";
	/**
	 * Ϊ�������û�����ʺ���
	 * @param name ����������
	 * @return �����ʺ������ַ���
	 */
	public String sayHello(String name) {
		return "���"+name;
	}
	public static void main(String[] args) {
		System.out.println(new DocDemo().sayHello("qaiu"));
	}
}
