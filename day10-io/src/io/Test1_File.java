package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test1_File {
    public static void main(String[] args) throws IOException {
        File file = new File("./1.txt");
        System.out.println(file.isDirectory());//�Ƿ���Ŀ¼
        System.out.println(file.exists());//�Ƿ����
        System.out.println(file.length());//�ļ�����
        System.out.println(file.canExecute());//�ɷ�����
        System.out.println(file.canRead());//�Ƿ�ɶ�
        System.out.println(file.canWrite());//�Ƿ��д
        System.out.println(file.isFile());//�Ƿ����ļ�
        System.out.println(file.getAbsoluteFile());//��ȡ�ļ�����·��
        System.out.println(file.getName());//��ȡ�ļ���
        System.out.println(file.getAbsolutePath());//��ȡ����·��
        System.out.println(file.getCanonicalFile());//��ȡ����·��(�淶·��)

//        file = new File("D:\\a\\b\\c\\d");
//        System.out.println(file.mkdirs());
//        file = new File("D:\\a\\b\\c\\d");
//        System.out.println(file.delete());
        file = new File("c:\\Windows");
        System.out.println(Arrays.toString(file.listFiles()));
    }
}
