package com.webserver.http;
/**
 * ���ඨ������HTTPЭ��涨֮����
 * @author QAIU
 *
 */

import java.util.HashMap;
import java.util.Map;

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
		mimeMapping.put("html", "text/html");
		mimeMapping.put("css", "text/css");
		mimeMapping.put("js", "application/javascript");
		mimeMapping.put("png", "image/png");
		mimeMapping.put("gif", "image/gif");
		mimeMapping.put("jpg", "image/jpeg");
	}
	/**
	 * ���ݸ�������Դ��׺����ȡ��Ӧ��Content-Type
	 * ͷ��ֵ
	 * @return
	 */
	public static String getContentType(String key) {
		return mimeMapping.get(key);
	}
}
