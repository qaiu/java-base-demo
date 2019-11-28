package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile src = new RandomAccessFile("5d512f13572b5.jpg", "r");
		RandomAccessFile desc = new RandomAccessFile("5d512f13572b5_copy.jpg", "rw");
		long start = System.currentTimeMillis();
		int d = 0;
		while ((d=src.read())!=-1) {
			desc.write(d);
		}
		start = System.currentTimeMillis()-start;
		System.out.println("¸´ÖÆÍê±Ï"+start+"ms");
		src.close();
		desc.close();
	}
}
