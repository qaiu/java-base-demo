package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本数据类型以及RAF基于指针的操作
 * @author QAIU
 *
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
		//获取RAF指针位置
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);

		System.out.println("pos:"+raf.getFilePointer());
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeInt(max);
		raf.writeLong(123456789123L);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeDouble(1.1111111111);
		System.out.println("pos:"+raf.getFilePointer());
		raf.seek(0);
		System.out.println(raf.readInt());
		System.out.println("pos:"+raf.getFilePointer());
		raf.close();
	}
}
