package com.webserver.http;
/**
 * 该类定义所有HTTP协议规定之内容
 * @author QAIU
 *
 */

import java.util.HashMap;
import java.util.Map;

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
		mimeMapping.put("html", "text/html");
		mimeMapping.put("css", "text/css");
		mimeMapping.put("js", "application/javascript");
		mimeMapping.put("png", "image/png");
		mimeMapping.put("gif", "image/gif");
		mimeMapping.put("jpg", "image/jpeg");
	}
	/**
	 * 根据给定的资源后缀名获取对应的Content-Type
	 * 头的值
	 * @return
	 */
	public static String getContentType(String key) {
		return mimeMapping.get(key);
	}
}
