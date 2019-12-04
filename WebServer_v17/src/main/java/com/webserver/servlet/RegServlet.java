package com.webserver.servlet;

import java.io.RandomAccessFile;
import java.util.Arrays;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * 用于处理用户注册业务的类
 * @author QAIU
 *
 */
public class RegServlet extends HttpServlet{
	
	public void service(HttpRequest request,HttpResponse response) {
		/*
		 * 1:通过request获取用户提交的注册信息
		 * 2:将该用户写入user.dat文件保存
		 * 3:设置response响应注册结果页面
		 */
		System.out.println("RegServlet:开始处理注册业务~~~");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		int age = Integer.parseInt(request.getParameter("age"));

		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("nickname:"+nickname);
		System.out.println("age:"+age);

		try (RandomAccessFile raf = new RandomAccessFile("user.dat","rw")){
			/* 
			 * 首先应当判断是否为重复用户
			 * 循环读取user.dat文件中的现有数据
			 * 将每条数据读出来进行对比
			 * 如果是重复用户,则直接设置response响应
			 * 给用户have_user页面
			 * 告知文件已存在
			 * 如果没有则进行注册操作
			 */

			for (int i = 0; i < raf.length()/100; i++) {
				byte[] data = new byte[32];
				raf.seek(i*100);
				raf.read(data);
				if (new String(data,"utf-8").trim().equals(username)) {
					forward("/myweb/have_user.html", request, response);
					return;
				}
			}

			raf.seek(raf.length());
			raf.write(Arrays.copyOf(username.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(password.getBytes("utf-8"), 32));
			raf.write(Arrays.copyOf(nickname.getBytes("utf-8"), 32));
			raf.writeInt(age);
			System.out.println("注册完毕!!");
			forward("/myweb/reg_success.html", request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 2:
		 * 将用户注册信息写入user.dat文件
		 * 一个用户名占用100字节
		 * 用户名,密码,昵称各占32字节
		 * 年龄int占4字节
		 */

		System.out.println("RegServlet:处理注册业务完毕");
	}
}
