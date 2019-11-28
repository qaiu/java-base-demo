package com.webserver.servlet;

import java.io.RandomAccessFile;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * 处理登录业务的类
 * @author QAIU
 *
 */
public class LoginServlet extends HttpServlet{
	public void service(HttpRequest request,HttpResponse response) {
		/*
		 * 1:通过request获取用户提交的注册信息
		 * 2:读取user.dat文件的用户名密码并判断
		 * 3:设置response响应注册结果页面
		 */
		try (RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			/* 
			 * 检测有没有这个用户
			 * 如果有读取密码判断密码是否正确
			 */

			for (int i = 0; i < raf.length()/100; i++) {
				byte[] data = new byte[32];
				byte[] pw = new byte[32];
				raf.seek(i*100);
				raf.read(data);
				raf.read(pw);

				if (new String(data,"utf-8")
						.trim()
						.equals(request
						.getParameter("username"))&&
						new String(pw,"utf-8")
						.trim()
						.equals
						(request
						.getParameter("password"))) {
					forward("/myweb/login_success.html", request, response);
					return;
				}
			}
			forward("/myweb/login_fail.html", request, response);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("RegServlet:处理登录业务完毕");
	}
}
