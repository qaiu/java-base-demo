package day16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;


public class Runner {
	private static ArrayList<String> list = new ArrayList<>();
	
	static {
		try {
			/*
			 * "/"��ʾbinĿ¼
			 */
			String path = Runnable.class.getResource("/config.txt").getPath();
			/*
			 * "d:/��/bin/config.txt" -- URL���� --> "d/%E4%B8%AD/bin/config.txt"
			 * --����--> "d/��/bin/config.txt"
			 */
			path = URLDecoder.decode(path);
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path),"GBK"));
			String line;
			while((line = in.readLine()) != null) {
				line = line.replace("\\s+", "");
				list.add(line);
			}
			in.close();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println("���������ļ�ʧ��");
			e.printStackTrace();
		}
	}
	
	public static void launch() throws Exception {
		for (String s : list) {
			String[] a = s.split(";");
			Class<?> c = Class.forName(a[0]);
			
			Object o = c.newInstance();
			Method m = c.getMethod(a[1]);
			m.invoke(o);
			
		}
	}
	public static void main(String[] args) throws Exception {
		Runner.launch();
	}
}
