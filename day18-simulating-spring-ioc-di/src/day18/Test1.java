package day18;

import java.io.File;
import java.net.URLDecoder;

public class Test1 {
	public static void main(String[] args) throws Exception {
		//��ȡBin������·��
		String path = Test1.class.getResource("/").getPath();
		
		path = URLDecoder.decode(path,"utf-8");
		System.out.println(path);
		
		File dir = new File(path);//ɨ��·���õ�class�ļ�
		scan(dir);
	}

	private static void scan(File dir) {
		//���ļ����б�
		File[] files = dir.listFiles();
		//·��������,�����ļ���û��Ȩ�޽���,��õ�nullֵ
		if (files == null) {
			return;
		}
		//���������ļ�����Ŀ¼���б���
		for (File f : files) {
			if (f.isFile()) { //f���ļ�
				System.out.println(f.getAbsolutePath());
			} else {//������ļ���
				scan(f);
			}
		}
	}
}
