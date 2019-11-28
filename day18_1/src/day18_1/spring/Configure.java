package day18_1.spring;

import java.io.File;
import java.net.URLDecoder;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import ognl.Ognl;

public class Configure {
	private static Map<String,Map> map;
	
	//�������������ļ�,��yml�ļ����ݽ���,����һ��Map����
	public static void load() throws Exception{
		String path = Configure.class.getResource("/application.yml").getPath();
		path = URLDecoder.decode(path, "utf-8");
		
		//ʹ��Jackson + yml����
		ObjectMapper m = new ObjectMapper(new YAMLFactory());
		map = m.readValue(new File(path), Map.class);
	}
	
	// ${spring.datasource.driver}  --- ognl���ʽ
	public static void get(String exp) throws Exception{
		exp = exp.replace("\\s+", "");
		exp = exp.substring(2,exp.length()-1);
//		String value = (String)Ognl
	}
	
}
