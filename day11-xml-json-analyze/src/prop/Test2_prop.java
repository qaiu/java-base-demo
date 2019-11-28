package prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

//������������������ļ��Ķ�ȡ
public class Test2_prop {
	
	//��Ԫ���Է���:@Test+public+void+�޲�
	@Test //ע��@
	public void read() throws IOException {
		//1.���������ļ�
		InputStream in = Test2_prop.class.getResourceAsStream("/jdbc.properties");
		
		//2.����
		Properties prop = new Properties();
		prop.load(in);
		
		String n = prop.getProperty("name");
		int a = Integer.parseInt(prop.getProperty("age"));
		System.out.println(n);
		System.out.println(a);
		
		in.close();
	}
	
}
