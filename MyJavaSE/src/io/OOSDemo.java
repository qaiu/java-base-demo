package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * ��������һ�Ը߼����������ǽ�java�������ֽ�
 * �����໥ת�����������Ƕ�дjava����
 * @author QAIU
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		String name = "����ʦ";
		int age = 18;
		String gender = "Ů";
		String[] outerInfo = {"�Ǹ���Ա","���Ե���","����дë����","�ٽ������Ļ�����"};
		
		Person p = new Person(name, age, gender, outerInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * ����������ṩ�ķ�����
		 * void writeObject(Object obj)
		 * ����������ṹת��һ���ֽڲ�д��
		 * 
		 * д�����������������ʵ��Serializable�ӿ�
		 * ����д��ʱ���׳��쳣
		 * һ������ת���ֽں�ᷢ�ֱȸö���ʵ�ʴ洢������Ҫ��
		 * ������Ϊ�����ֽڳ��˰�����ǰ����������� ��Ҫ��¼�����
		 * �ṹ��Ϣ�Ա��ڻ�ԭ
		 * 
		 * �����漰������רҵ����
		 * 1.��һ�����󾭹�������д��ʱ
		 * �������ᰴ����ṹ���ö���ת����һ���ֽ�
		 * ������̽����������л�
		 * 
		 * 2.���鱻���л�����ֽ��ھ����ļ���д���ļ���д����̣�
		 * �����ñ���Ĺ���
		 * �������ݳ־û�
		 */
		oos.writeObject(p);
		System.out.println("д�����");
		oos.close();
		
	}
}
