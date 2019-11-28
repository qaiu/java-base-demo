package com.webserver.http;
/**
 * ���ඨ������HTTPЭ��涨֮����
 * @author QAIU
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HttpContext {
	/**
	 * �س���
	 */
	public static final char CR = 13;
	/**
	 * ���з�
	 */
	public static final char LF = 10;
	
	/**
	 * ��Դ��׺��Content-Type�Ķ�Ӧ��ϵ
	 * key: ��Դ��׺��
	 * value: ����Դ��Ӧ��Content-Typeֵ
	 */
	private static Map<String, String> mimeMapping = new HashMap<>();
	static {
		//��ʼ����̬��Դ
		initMimeMapping();
	}
	private static void initMimeMapping() {
		/*
		 * ʹ��dom4j����:./conf/web.xml�ļ�
		 * ������ǩ��������Ϊmime-mapping���ӱ�ǩ
		 *  extension�м���ı���Ϊkey
		 *  mime-type�м���ı���Ϊvalue
		 *  
		 * ����mimeMapping���Map��ɳ�ʼ��
		 */
		try {
			
			List<?> list = new SAXReader()
					.read("./conf/web.xml")
					.getRootElement()
					.elements("mime-mapping");
			for (Object element : list) {
				mimeMapping
				.put(((Element)element)
				.elementTextTrim("extension"), 
				((Element)element)
				.elementTextTrim("mime-type"));
			}
			
			System.out.println(mimeMapping.size());
		} catch (DocumentException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	/**
	 * ���ݸ�������Դ��׺����ȡ��Ӧ��Content-Type
	 * ͷ��ֵ
	 * @return
	 */
	public static String getContentType(String key) {
		return mimeMapping.get(key);
	}
	public static void main(String[] args) {
	}
}
