package file;

import java.io.File;

/**
 * java.io.File
 * File������ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ʹ��File���ǿ��ԣ�
 * 1���������ʾ���ļ���Ŀ¼�����ԣ����ƣ���С�ȣ�
 * 2�������ļ���Ŀ¼��������ɾ����
 * 3������Ŀ¼����
 * 
 * ���ǲ��ܷ����ļ�����
 * @author QAIU
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * ����Fileʱָ��·��ͨ��������·��
		 * ����·���ŵ����������ˣ����ǲ��ܱ�ͨ
		 * �������ڿ�ƽ̨
		 * ���·�����ģ��������������Ҫ�����л�������
		 * ������Ӧ�Ը�ǿ����ƽ̨��
		 * 
		 * ���·����"."��ʾ��ǰĿ¼����Eclipse��
		 * ����ʱ��"."��Ӧ��Ŀ¼�ǵ�ǰ�������ڵ���ĿĿ¼
		 */
		File file = new File("./demo.txt");//���ļ�
		
		System.out.println(File.pathSeparator);//·���ָ���
		System.out.println(file.getName());//��ȡ�ļ���
		System.out.println(file.length());//��ȡ�ļ���С�����ȣ�
		//�ɶ� ��д ������ �Ƿ�����
		System.out.println("�ɶ���"+file.canRead());
		System.out.println("��д��"+file.canWrite());
		System.out.println("�����У�"+file.canExecute());
		System.out.println("���أ�"+file.isHidden());
		
	}
}
