package exception;
/**
 * �쳣��������е�try-catch
 * �﷨��
 * try {
 * 	����Ƭ��
 * }catch(XXXException e){
 * 	��try�еĴ���XXXExceptionʱ�Ĵ������
 * }
 * @author QAIU
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		/*
		 * ��jvmָ����������쳣ʱ�����Զ�ʵ������Ӧ���쳣ʵ��
		 * ����ִ�й����ú�Ȼ�����׳�
		 */
		System.out.println("����ʼ��");
		try {
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			/*
			 * try����е�ĳһ�����������쳣������������ݲ�����ִ��
			 * ִ�������Ӧ��catch��ʹ�catch֮�����������
			 */
			System.out.println("!!!!!!!!");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("�±�Խ���쳣");
		}
		/*
		 * �����һ��catch��������Exception����
		 * ���̶ȱ�����Ϊһ��δ������쳣���³����ж�
		 */
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("����");
		}
		System.out.println("���������");
	}

}
