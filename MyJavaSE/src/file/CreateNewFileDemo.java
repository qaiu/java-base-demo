package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���ļ�
 * @author QAIU
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´������ļ���test.txt
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * �ж�File��ʾ���ļ���Ŀ¼�Ƿ���ʵ����
		 */
		if (!file.exists()) {
			//����ļ��������򴴽����ļ�
			file.createNewFile();
			System.out.println("�ļ��Ѵ���");
		} else {

			System.out.println("�ļ��Ѵ���");
		}
	}
}
