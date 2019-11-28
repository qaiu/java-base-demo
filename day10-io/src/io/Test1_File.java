package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test1_File {
    public static void main(String[] args) throws IOException {
        File file = new File("./1.txt");
        System.out.println(file.isDirectory());//是否是目录
        System.out.println(file.exists());//是否存在
        System.out.println(file.length());//文件长度
        System.out.println(file.canExecute());//可否运行
        System.out.println(file.canRead());//是否可读
        System.out.println(file.canWrite());//是否可写
        System.out.println(file.isFile());//是否是文件
        System.out.println(file.getAbsoluteFile());//获取文件完整路径
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getAbsolutePath());//获取完整路径
        System.out.println(file.getCanonicalFile());//获取绝对路径(规范路径)

//        file = new File("D:\\a\\b\\c\\d");
//        System.out.println(file.mkdirs());
//        file = new File("D:\\a\\b\\c\\d");
//        System.out.println(file.delete());
        file = new File("c:\\Windows");
        System.out.println(Arrays.toString(file.listFiles()));
    }
}
