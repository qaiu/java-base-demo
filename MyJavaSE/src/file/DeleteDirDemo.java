package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author QAIU
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		// ����ǰĿ¼�µ�demoĿ¼ɾ��
		File dir =  new File("./a");
		if (dir.exists()) {
			/*
			 * ʹ��deleteɾ��Ŀ¼ʱ �����ǿ�Ŀ¼ ����ɾ��ʧ��
			 */
			dir.delete();
			System.out.println("Ŀ¼��ɾ��");
		} else {
			System.out.println("Ŀ¼������");
		}
		
	}
}
