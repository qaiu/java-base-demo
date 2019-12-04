package exception;

import java.io.FileOutputStream;

/**
 * jdk7������:�Զ��ر�
 * 
 * @author QAIU
 *
 */
public class AutoCloseableDemo {
	public static void main(String[] args) {
		/*
		 * ֻ��ʵ����Autocloseable�ӿڵ�����������ﶨ��
		 * ����FileOutputStream��ʵ��������ӿ�
		 * ���������ڱ���ʱ�����ﶨ�������������finally�е���
		 * close�����ر�
		 */
		try (FileOutputStream fos = new FileOutputStream("fos.dat");) {
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
