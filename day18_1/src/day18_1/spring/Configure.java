package day18_1.spring;

import java.io.File;
import java.net.URLDecoder;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import ognl.Ognl;

public class Configure {
	private static Map<String,Map> map;
	
	//用来加载配置文件,把yml文件数据解析,生成一个Map集合
	public static void load() throws Exception{
		String path = Configure.class.getResource("/application.yml").getPath();
		path = URLDecoder.decode(path, "utf-8");
		
		//使用Jackson + yml解析
		ObjectMapper m = new ObjectMapper(new YAMLFactory());
		map = m.readValue(new File(path), Map.class);
	}
	
	// ${spring.datasource.driver}  --- ognl表达式
	public static void get(String exp) throws Exception{
		exp = exp.replace("\\s+", "");
		exp = exp.substring(2,exp.length()-1);
//		String value = (String)Ognl
	}
	
}
