package com.webserver.servlet;

import java.io.File;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * 所有Servlet的超类
 * @author QAIU
 */

public abstract class HttpServlet {
	public abstract void service(HttpRequest request, HttpResponse response);
	
	/**
	 * 跳转指定页面
	 * @param path
	 * @param request
	 * @param response
	 */
	public void forward(String path, HttpRequest request, HttpResponse response) {
		response.setEntity(new File("./webapps"+path));
	}
}
