package exception;
/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author QAIU
 *
 */
public class Person {
	private int age;

	public int getAge() {
		
		return age;
	}
	/**
	 * ��һ��������ʹ��throw�׳�ĳ���쳣ʱ,��Ҫ��
	 * ��ǰ������ʹ��throws�������쳣���׳� ��֪ͨ
	 * �����ߴ�����쳣
	 * ֻ���׳�RuntimeExceptionʱ ��������Ҫ�����д,
	 * �������дthrows
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		if (age<0 || age>100) {
			//�����׳��쳣��֪ҵ�񲻺���
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
	
}
