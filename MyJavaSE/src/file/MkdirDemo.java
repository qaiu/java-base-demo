package file;

import java.io.File;

/**
 * ����һ����Ŀ¼
 * @author QAIU
 *
 */
public class MkdirDemo {
	public static void main(String[] args) {
		// �ڵ�ǰĿ¼�´�����Ŀ¼Demo
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���");
		} else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}
}
