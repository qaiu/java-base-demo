package prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

//这个类用来测试属性文件的读取
public class Test2_prop {
	
	//单元测试方法:@Test+public+void+无参
	@Test //注解@
	public void read() throws IOException {
		//1.加载属性文件
		InputStream in = Test2_prop.class.getResourceAsStream("/jdbc.properties");
		
		//2.解析
		Properties prop = new Properties();
		prop.load(in);
		
		String n = prop.getProperty("name");
		int a = Integer.parseInt(prop.getProperty("age"));
		System.out.println(n);
		System.out.println(a);
		
		in.close();
	}
	
}
