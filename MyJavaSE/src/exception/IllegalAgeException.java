package exception;
/**
 * ���䲻�Ϸ��쳣
 * 
 * �Զ����쳣,ͨ����������������Ŀ��ĳ��ҵ���߼�����
 * �Ĵ���
 * 
 * ����һ���쳣ͨ����Ҫһ�¼�������:
 * 1:�����ಢָ�����ϸ��쳣������
 * 2:��Ҫ�̳�Exception(���Լ�Ӽ̳�)
 * 3:�ṩ���л��汾��
 * 4:�ṩ���й��췽��
 * 
 * @author QAIU
 *
 */
public class IllegalAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public IllegalAgeException() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param message
	 * @param cause
	 */
	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param message
	 */
	public IllegalAgeException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param cause
	 */
	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}
	

}
