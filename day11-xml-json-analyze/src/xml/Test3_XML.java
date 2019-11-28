package xml;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

//ʹ����������dom4j����xml

public class Test3_XML {
	
	//��Ԫ���Է���
	@Test
	public void getData() throws Exception {
		//1.����XML�ļ�
		InputStream in = Test3_XML.class.getResourceAsStream("/spring.xml");
		
		
		//2.����XML
		SAXReader sax = new SAXReader();
		Document doc = sax.read(in);
		
		//3.��ȡ���ڵ�Beans
		Element root = doc.getRootElement();
		System.out.println(root.getName());
		
		//4.��ȡBeans�������beanԪ��
		List<Element> list = root.elements();
		
		//5.����list����
		//foreach�ṹ
		for (Element e : list) {//e�����ȡ����ÿ��bean
			System.out.println(e.attributeValue("id")+":"+
					e.attributeValue("class"));//��ȡbean��Ӧ��ÿһ��id class
			System.out.println(e.getTextTrim());
			
		}
		in.close();
		
		
	}
}
