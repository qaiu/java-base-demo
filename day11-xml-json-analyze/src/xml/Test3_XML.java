package xml;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

//使用这个类测试dom4j解析xml

public class Test3_XML {
	
	//单元测试方法
	@Test
	public void getData() throws Exception {
		//1.加载XML文件
		InputStream in = Test3_XML.class.getResourceAsStream("/spring.xml");
		
		
		//2.解析XML
		SAXReader sax = new SAXReader();
		Document doc = sax.read(in);
		
		//3.获取根节点Beans
		Element root = doc.getRootElement();
		System.out.println(root.getName());
		
		//4.获取Beans里的所有bean元素
		List<Element> list = root.elements();
		
		//5.遍历list集合
		//foreach结构
		for (Element e : list) {//e代表读取到的每个bean
			System.out.println(e.attributeValue("id")+":"+
					e.attributeValue("class"));//获取bean对应的每一个id class
			System.out.println(e.getTextTrim());
			
		}
		in.close();
		
		
	}
}
