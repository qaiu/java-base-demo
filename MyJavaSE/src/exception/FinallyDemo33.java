package exception;

/**
 * Finally���������� 
 * 
 * 1:��ֱ�˵��final,finally,finalize 
 * final��һ�����η� 
 * ��final���ε��಻���Ա��̳�
 * ��final���εı�����һ������ֻ�ܸ�ֵһ�Σ� 
 * ��final���εķ��������Ա���д
 * 
 * finally����
 * finally���쳣����ʱ�ṩfinally����ִ���������������
 * ��Ҫ��try-catch-finally���ʹ�á�
 * finally��������������۳���ʲô�����
 * finally���е����һ���ᱻִ�У���������return֮ǰִ�С�
 * ����JAVA�淶�����try-finally����catch-finally�ж���return��
 * ��2��return��ִ�в����շ��ص������������finally�е�return��
 * ���finally��û��return�򷵻ص���catch�е�return�� 
 * ����finally�еĴ���Ҳ��Ҫִ�еġ�
 * 
 * finalize�Ƿ�������
 * ʹ��finalize�����������ռ����������
 * �ڴ��������ȥ֮ǰ����Ҫ����������
 * ����������������ռ�����ȷ���������
 * û�б�����ʱ�����������õġ�������
 * object���ж���ģ�������е��඼�̳�������
 * ���า��finalize����������ϵͳ��Դ���߱�ִ��������������
 * 
 * @author QAIU
 */
public class FinallyDemo33 {
	public static void main(String[] args) {
		System.out.println(test("0") + "," + test(null) + "," + test(""));
	}

	public static int test(String str) {
		try {
			return str.charAt(0) - '0';
		} catch (NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
