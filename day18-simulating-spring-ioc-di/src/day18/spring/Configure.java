package day18.spring;
import java.io.File;
import java.net.URLDecoder;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import ognl.Ognl;

public class Configure {
	private static Map<String,Map> map;
	
	//用来加载配置,把yml配置数据解析,生成一个Map集合
	public static void load() throws Exception{
		String path = Configure.class.getResource("/application.yml").getPath();
		path = URLDecoder.decode(path,"utf-8");
		
		//使用Jackson + yaml 插件,来解析处理yaml配置文件
		ObjectMapper m = new ObjectMapper(new YAMLFactory());
		map = m.readValue(new File(path), Map.class);
	}
	
	/*
	 * "${spring.datasource.driver}"  ---- OGNL 表达式
	 */
	public static String get(String exp) throws Exception{
		exp = exp.replaceAll("\\s+", "");
		exp = exp.substring(2,exp.length() - 1);
		String value = (String) Ognl.getValue(exp, map);
		return value;
	}
	
	public static void main(String[] args) throws Exception{
		Configure.load();
		System.out.println(map);
		System.out.println(Configure.get("${spring.datasource.driver}"));
	}
}
