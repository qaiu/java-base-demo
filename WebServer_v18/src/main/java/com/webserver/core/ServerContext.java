package com.webserver.core;
/**
 * 服务器相关的配置都放在这里
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
	 * 请求对应的Servlet的关系
	 * Key:请求路径
	 * Value:处理请求的Servlet
	 * 
	 */
	static {
		initServletMapping();
	}
	
	private static void initServletMapping() {
		//		servletMapping.put("/myweb/reg", new RegServlet());
		//		servletMapping.put("/myweb/login", new LoginServlet());
		/*
		 * 解析conf/servlet.xml文件
		 * 将根标签<servlet>标签获取到
		 * 将其属性path值作为key
		 * 将属性className值去到后利用反射加载该类并实例化
		 * 将实例化的对象作为Key放进ServletMapping完成初始化
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
	 * 根据请求路径获取对应的Servlet
	 * @return 
	 */
	public static HttpServlet getServlet(String path) {
		return servletMapping.get(path);
	}

}
