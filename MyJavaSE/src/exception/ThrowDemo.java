package exception;
/**
 * �쳣���׳�
 * ʹ��throw�ؼ��ֿ��������׳�һ���쳣ʵ��
 * ͨ��������������������׳��쳣
 * 1:�����﷨Ҫ��,��������ҵ���߼�ʱ
 * 2:��ǰ����Ƭ��ȷʵ�������쳣,���Ǹ��쳣����Ӧ��
 * �ڵ�ǰ����Ƭ�α����ʱ
 * @author QAIU
 *
 */

public class ThrowDemo {
	public static void main(String[] args) {
		Person p = new Person();
		//�����﷨Ҫ��,���ǲ�����ҵ���߼�
		try {
			/*
			 * �����ǵ���һ������throws�����ķ���ʱ,��������Ҫ�����Ǳ��봦��
			 * ���쳣,ͨ�������ֶ�������
			 * 1.ʹ��try-catch��׽������
			 * 2.�ڵ�ǰ��������ʹ��throws���������쳣�׳�
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}

}
