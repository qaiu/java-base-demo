package com.webserver.http;
/**
 * 该类定义所有HTTP协议规定之内容
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
	 * 回车符
	 */
	public static final char CR = 13;
	/**
	 * 换行符
	 */
	public static final char LF = 10;
	
	/**
	 * 资源后缀与Content-Type的对应关系
	 * key: 资源后缀名
	 * value: 该资源对应的Content-Type值
	 */
	private static Map<String, String> mimeMapping = new HashMap<>();
	static {
		//初始化静态资源
		initMimeMapping();
	}
	private static void initMimeMapping() {
		/*
		 * 使用dom4j解析:./conf/web.xml文件
		 * 将根标签下所有名为mime-mapping的子标签
		 *  extension中间的文本作为key
		 *  mime-type中间的文本作为value
		 *  
		 * 存入mimeMapping这个Map完成初始化
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 根据给定的资源后缀名获取对应的Content-Type
	 * 头的值
	 * @return
	 */
	public static String getContentType(String key) {
		return mimeMapping.get(key);
	}
	public static void main(String[] args) {
	}
}
