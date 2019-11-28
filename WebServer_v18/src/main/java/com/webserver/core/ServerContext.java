package com.webserver.core;
/**
 * ��������ص����ö���������
 * @author QAIU
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.webserver.servlet.HttpServlet;

public class ServerContext {
	private static Map<String, HttpServlet> servletMapping = new HashMap<>();

	/**
	 * �����Ӧ��Servlet�Ĺ�ϵ
	 * Key:����·��
	 * Value:���������Servlet
	 * 
	 */
	static {
		initServletMapping();
	}
	
	private static void initServletMapping() {
		//		servletMapping.put("/myweb/reg", new RegServlet());
		//		servletMapping.put("/myweb/login", new LoginServlet());
		/*
		 * ����conf/servlet.xml�ļ�
		 * ������ǩ<servlet>��ǩ��ȡ��
		 * ��������pathֵ��Ϊkey
		 * ������classNameֵȥ�������÷�����ظ��ಢʵ����
		 * ��ʵ�����Ķ�����ΪKey�Ž�ServletMapping��ɳ�ʼ��
		 */
		try {
			List<?> list = new SAXReader()
					.read("./conf/servlets.xml")
					.getRootElement()
					.elements("servlet");
			
			System.out.println(list.size());
			for (Object element : list) {
				String path = ((Element) element).attributeValue("path");
				System.out.println(path);
				String name = ((Element) element).attributeValue("className");
				Object obj = Class.forName(name).newInstance();
				servletMapping.put(path, (HttpServlet)obj);
			}
			System.out.println(servletMapping.size());
		}catch (Exception e) {
			e.printStackTrace();
		}


	}
	/**
	 * ��������·����ȡ��Ӧ��Servlet
	 * @return 
	 */
	public static HttpServlet getServlet(String path) {
		return servletMapping.get(path);
	}

}
