package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author QAIU
 *
 */
public class MkdirsDemo {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´�����a/b/c/d/e/fĿ¼
		 */
		File dirs = new File("./a/b/c/d/e/f");
		if (!dirs.exists()) {
			/*
			 * mkdirs�Ὣ���в����ڵĸ�Ŀ¼һͬ��������
			 * ��mkdir���ᣬ�����Ŀ¼�������򴴽�ʧ��
			 * ����Ժ��Ƽ�ʹ��mkdirs����Ŀ¼
			 */
			dirs.mkdirs();
			System.out.println("Ŀ¼�Ѵ�����");
		} else {
			System.out.println("Ŀ¼�����ڣ�");
		}
	}
}
