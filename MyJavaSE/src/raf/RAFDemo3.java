package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF��д�������������Լ�RAF����ָ��Ĳ���
 * @author QAIU
 *
 */
public class RAFDemo3 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
		//��ȡRAFָ��λ��
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
