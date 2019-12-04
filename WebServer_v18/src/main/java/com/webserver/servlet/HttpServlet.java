package com.webserver.servlet;

import java.io.File;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * ����Servlet�ĳ���
 * @author QAIU
 */

public abstract class HttpServlet {
	public abstract void service(HttpRequest request, HttpResponse response);
	
	/**
	 * ��תָ��ҳ��
	 * @param path
	 * @param request
	 * @param response
	 */
	public void forward(String path, HttpRequest request, HttpResponse response) {
		response.setEntity(new File("./webapps"+path));
	}
}
